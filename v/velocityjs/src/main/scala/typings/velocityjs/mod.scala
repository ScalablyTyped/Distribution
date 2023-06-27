package typings.velocityjs

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("velocityjs", JSImport.Namespace)
  @js.native
  val ^ : Velocity = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("velocityjs", "Compile")
  @js.native
  open class Compile protected ()
    extends StObject
       with typings.velocityjs.Compile {
    def this(asts: js.Array[VELOCITY_AST]) = this()
    def this(asts: js.Array[VELOCITY_AST], config: CompileConfig) = this()
  }
  
  type _To = Velocity
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Velocity = ^
}
