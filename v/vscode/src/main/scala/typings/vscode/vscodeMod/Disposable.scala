package typings.vscode.vscodeMod

import typings.vscode.Anon_Dispose
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode", "Disposable")
@js.native
class Disposable protected () extends js.Object {
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
@JSImport("vscode", "Disposable")
@js.native
object Disposable extends js.Object {
  /**
  		 * Combine many disposable-likes into one. Use this method
  		 * when having objects with a dispose function which are not
  		 * instances of Disposable.
  		 *
  		 * @param disposableLikes Objects that have at least a `dispose`-function member.
  		 * @return Returns a new disposable which, upon dispose, will
  		 * dispose all provided disposables.
  		 */
  def from(disposableLikes: Anon_Dispose*): Disposable = js.native
}

