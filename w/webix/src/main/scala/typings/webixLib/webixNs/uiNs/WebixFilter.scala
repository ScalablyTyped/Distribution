package typings
package webixLib.webixNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait WebixFilter extends js.Object {
  def getValue(node: stdLib.HTMLElement): js.Any
  def refresh(master: baseview, node: stdLib.HTMLElement, value: js.Any): scala.Unit
  def render(master: baseview, config: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String
  def setValue(node: stdLib.HTMLElement, value: js.Any): js.Any
}

