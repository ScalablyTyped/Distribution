package typings.vinylBuffer

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("vinyl-buffer", JSImport.Namespace)
  @js.native
  val ^ : Buffer = js.native
  
  type Buffer = js.Function0[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ReadWriteStream */ Any
  ]
  
  type _To = Buffer
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Buffer = ^
}
