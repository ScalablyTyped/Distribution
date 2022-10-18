package typings.vueLoader

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDescriptorCacheMod {
  
  @JSImport("vue-loader/dist/descriptorCache", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getDescriptor(filename: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getDescriptor")(filename.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def setDescriptor(
    filename: String,
    entry: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SFCDescriptor */ Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setDescriptor")(filename.asInstanceOf[js.Any], entry.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
