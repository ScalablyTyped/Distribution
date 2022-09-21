package typings.upath2

import org.scalablytyped.runtime.Shortcut
import typings.upath2.coreMod.IUPath
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("upath2", JSImport.Namespace)
  @js.native
  val ^ : IUPath = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("upath2", "PathWrap")
  @js.native
  open class PathWrap protected ()
    extends typings.upath2.coreMod.PathWrap {
    def this(path: Any, id: String) = this()
  }
  
  type _To = IUPath
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: IUPath = ^
}
