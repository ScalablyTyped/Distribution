package typings.vscode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Thenable is a common denominator between ES6 promises, Q, jquery.Deferred, WinJS.Promise,
  * and others. This API makes no assumption about what promise library is being used which
  * enables reusing existing code without migrating to a specific promise implementation. Still,
  * we recommend the use of native promises which are available in this editor.
  */
@js.native
trait Thenable[T] extends StObject {
  
  /**
    * Attaches callbacks for the resolution and/or rejection of the Promise.
    * @param onfulfilled The callback to execute when the Promise is resolved.
    * @param onrejected The callback to execute when the Promise is rejected.
    * @returns A Promise for the completion of which ever callback is executed.
    */
  def `then`[TResult](): Thenable[TResult] = js.native
  def `then`[TResult](onfulfilled: js.Function1[/* value */ T, TResult | Thenable[TResult]]): Thenable[TResult] = js.native
  def `then`[TResult](
    onfulfilled: js.Function1[/* value */ T, TResult | Thenable[TResult]],
    onrejected: js.Function1[/* reason */ Any, TResult | Thenable[TResult] | Unit]
  ): Thenable[TResult] = js.native
  def `then`[TResult](onfulfilled: Unit, onrejected: js.Function1[/* reason */ Any, TResult | Thenable[TResult] | Unit]): Thenable[TResult] = js.native
}
