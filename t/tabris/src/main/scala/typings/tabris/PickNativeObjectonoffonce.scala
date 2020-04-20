package typings.tabris

import typings.tabris.mod.EventObject
import typings.tabris.mod.NativeObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<tabris.tabris.NativeObject, 'on' | 'off' | 'once' | 'trigger'> */
@js.native
trait PickNativeObjectonoffonce extends js.Object {
  @JSName("off")
  var off_Original: js.Function3[
    /* type */ String, 
    /* listener */ js.Function1[/* event */ EventObject[NativeObject], Unit], 
    /* context */ js.UndefOr[js.Object], 
    this.type
  ] = js.native
  @JSName("on")
  var on_Original: js.Function3[
    /* type */ String, 
    /* listener */ js.Function1[/* event */ EventObject[NativeObject], _], 
    /* context */ js.UndefOr[js.Object], 
    this.type
  ] = js.native
  @JSName("once")
  var once_Original: js.Function3[
    /* type */ String, 
    /* listener */ js.Function1[/* event */ EventObject[NativeObject], _], 
    /* context */ js.UndefOr[js.Object], 
    this.type
  ] = js.native
  @JSName("trigger")
  var trigger_Original: js.Function1[/* type */ String, this.type] = js.native
  def off(`type`: String, listener: js.Function1[/* event */ EventObject[NativeObject], Unit]): this.type = js.native
  def off(
    `type`: String,
    listener: js.Function1[/* event */ EventObject[NativeObject], Unit],
    context: js.Object
  ): this.type = js.native
  def on(`type`: String, listener: js.Function1[/* event */ EventObject[NativeObject], _]): this.type = js.native
  def on(
    `type`: String,
    listener: js.Function1[/* event */ EventObject[NativeObject], _],
    context: js.Object
  ): this.type = js.native
  def once(`type`: String, listener: js.Function1[/* event */ EventObject[NativeObject], _]): this.type = js.native
  def once(
    `type`: String,
    listener: js.Function1[/* event */ EventObject[NativeObject], _],
    context: js.Object
  ): this.type = js.native
  def trigger(`type`: String): this.type = js.native
}

