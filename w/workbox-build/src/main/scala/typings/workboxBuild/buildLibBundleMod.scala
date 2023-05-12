package typings.workboxBuild

import typings.workboxBuild.anon.OmitGeneratePartialruntim
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildLibBundleMod {
  
  @JSImport("workbox-build/build/lib/bundle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def bundle(param0: OmitGeneratePartialruntim): js.Promise[js.Array[NameAndContents]] = ^.asInstanceOf[js.Dynamic].applyDynamic("bundle")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[NameAndContents]]]
  
  trait NameAndContents extends StObject {
    
    var contents: String | js.typedarray.Uint8Array
    
    var name: String
  }
  object NameAndContents {
    
    inline def apply(contents: String | js.typedarray.Uint8Array, name: String): NameAndContents = {
      val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[NameAndContents]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NameAndContents] (val x: Self) extends AnyVal {
      
      inline def setContents(value: String | js.typedarray.Uint8Array): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
