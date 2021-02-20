package typings.vscode.mod

import typings.vscode.anon.Dispose
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode", "Disposable")
@js.native
class Disposable protected () extends StObject {
  /**
    * Creates a new Disposable calling the provided function
    * on dispose.
    * @param callOnDispose Function that disposes something.
    */
  def this(callOnDispose: js.Function) = this()
  
  /**
    * Dispose this object.
    */
  def dispose(): js.Any = js.native
}
/* static members */
object Disposable {
  
  /**
    * Combine many disposable-likes into one. Use this method
    * when having objects with a dispose function which are not
    * instances of Disposable.
    *
    * @param disposableLikes Objects that have at least a `dispose`-function member.
    * @return Returns a new disposable which, upon dispose, will
    * dispose all provided disposables.
    */
  @JSImport("vscode", "Disposable.from")
  @js.native
  def from(disposableLikes: Dispose*): Disposable = js.native
}
