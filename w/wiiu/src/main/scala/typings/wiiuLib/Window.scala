package typings
package wiiuLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Window extends js.Object {
  var wiiu: Typeofwiiu = js.native
  @JSName("addEventListener")
  def addEventListener_wiiu_imageview_change_content(
    `type`: wiiuLib.wiiuLibStrings.wiiu_imageview_change_content,
    listener: js.Function1[/* ev */ stdLib.CustomEvent[_], _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_wiiu_imageview_change_content(
    `type`: wiiuLib.wiiuLibStrings.wiiu_imageview_change_content,
    listener: js.Function1[/* ev */ stdLib.CustomEvent[_], _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_wiiu_imageview_change_viewmode(
    `type`: wiiuLib.wiiuLibStrings.wiiu_imageview_change_viewmode,
    listener: js.Function1[/* ev */ stdLib.CustomEvent[_], _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_wiiu_imageview_change_viewmode(
    `type`: wiiuLib.wiiuLibStrings.wiiu_imageview_change_viewmode,
    listener: js.Function1[/* ev */ stdLib.CustomEvent[_], _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_wiiu_imageview_end(
    `type`: wiiuLib.wiiuLibStrings.wiiu_imageview_end,
    listener: js.Function1[/* ev */ stdLib.CustomEvent[_], _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_wiiu_imageview_end(
    `type`: wiiuLib.wiiuLibStrings.wiiu_imageview_end,
    listener: js.Function1[/* ev */ stdLib.CustomEvent[_], _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_wiiu_imageview_error(
    `type`: wiiuLib.wiiuLibStrings.wiiu_imageview_error,
    listener: js.Function1[/* ev */ stdLib.CustomEvent[_], _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_wiiu_imageview_error(
    `type`: wiiuLib.wiiuLibStrings.wiiu_imageview_error,
    listener: js.Function1[/* ev */ stdLib.CustomEvent[_], _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_wiiu_imageview_start(
    `type`: wiiuLib.wiiuLibStrings.wiiu_imageview_start,
    listener: js.Function1[/* ev */ stdLib.CustomEvent[_], _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_wiiu_imageview_start(
    `type`: wiiuLib.wiiuLibStrings.wiiu_imageview_start,
    listener: js.Function1[/* ev */ stdLib.CustomEvent[_], _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
}

