package typings
package winjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Element extends js.Object {
  var element: winjsLib.WinJSNs.Promise[stdLib.HTMLElement]
  var renderComplete: winjsLib.WinJSNs.Promise[_]
}

object Anon_Element {
  @scala.inline
  def apply(element: winjsLib.WinJSNs.Promise[stdLib.HTMLElement], renderComplete: winjsLib.WinJSNs.Promise[_]): Anon_Element = {
    val __obj = js.Dynamic.literal(element = element, renderComplete = renderComplete)
  
    __obj.asInstanceOf[Anon_Element]
  }
}

