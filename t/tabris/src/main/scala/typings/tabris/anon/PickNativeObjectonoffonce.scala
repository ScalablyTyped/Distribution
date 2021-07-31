package typings.tabris.anon

import typings.tabris.mod.EventObject
import typings.tabris.mod.NativeObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<tabris.tabris.NativeObject, 'on' | 'off' | 'once' | 'trigger'> */
trait PickNativeObjectonoffonce extends StObject {
  
  def off(`type`: String, listener: js.Function1[/* event */ EventObject[NativeObject], Unit]): this.type
  def off(
    `type`: String,
    listener: js.Function1[/* event */ EventObject[NativeObject], Unit],
    context: js.Object
  ): this.type
  @JSName("off")
  var off_Original: js.Function3[
    /* type */ String, 
    /* listener */ js.Function1[/* event */ EventObject[NativeObject], Unit], 
    /* context */ js.UndefOr[js.Object], 
    this.type
  ]
  
  def on(`type`: String, listener: js.Function1[/* event */ EventObject[NativeObject], js.Any]): this.type
  def on(
    `type`: String,
    listener: js.Function1[/* event */ EventObject[NativeObject], js.Any],
    context: js.Object
  ): this.type
  @JSName("on")
  var on_Original: js.Function3[
    /* type */ String, 
    /* listener */ js.Function1[/* event */ EventObject[NativeObject], js.Any], 
    /* context */ js.UndefOr[js.Object], 
    this.type
  ]
  
  def once(`type`: String, listener: js.Function1[/* event */ EventObject[NativeObject], js.Any]): this.type
  def once(
    `type`: String,
    listener: js.Function1[/* event */ EventObject[NativeObject], js.Any],
    context: js.Object
  ): this.type
  @JSName("once")
  var once_Original: js.Function3[
    /* type */ String, 
    /* listener */ js.Function1[/* event */ EventObject[NativeObject], js.Any], 
    /* context */ js.UndefOr[js.Object], 
    this.type
  ]
  
  def trigger(`type`: String): this.type
  @JSName("trigger")
  var trigger_Original: js.Function1[/* type */ String, this.type]
}
object PickNativeObjectonoffonce {
  
  @scala.inline
  def apply(
    off: (/* type */ String, /* listener */ js.Function1[/* event */ EventObject[NativeObject], Unit], /* context */ js.UndefOr[js.Object]) => PickNativeObjectonoffonce,
    on: (/* type */ String, /* listener */ js.Function1[/* event */ EventObject[NativeObject], js.Any], /* context */ js.UndefOr[js.Object]) => PickNativeObjectonoffonce,
    once: (/* type */ String, /* listener */ js.Function1[/* event */ EventObject[NativeObject], js.Any], /* context */ js.UndefOr[js.Object]) => PickNativeObjectonoffonce,
    trigger: /* type */ String => PickNativeObjectonoffonce
  ): PickNativeObjectonoffonce = {
    val __obj = js.Dynamic.literal(off = js.Any.fromFunction3(off), on = js.Any.fromFunction3(on), once = js.Any.fromFunction3(once), trigger = js.Any.fromFunction1(trigger))
    __obj.asInstanceOf[PickNativeObjectonoffonce]
  }
  
  @scala.inline
  implicit class PickNativeObjectonoffonceMutableBuilder[Self <: PickNativeObjectonoffonce] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOff(
      value: (/* type */ String, /* listener */ js.Function1[/* event */ EventObject[NativeObject], Unit], /* context */ js.UndefOr[js.Object]) => PickNativeObjectonoffonce
    ): Self = StObject.set(x, "off", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOn(
      value: (/* type */ String, /* listener */ js.Function1[/* event */ EventObject[NativeObject], js.Any], /* context */ js.UndefOr[js.Object]) => PickNativeObjectonoffonce
    ): Self = StObject.set(x, "on", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnce(
      value: (/* type */ String, /* listener */ js.Function1[/* event */ EventObject[NativeObject], js.Any], /* context */ js.UndefOr[js.Object]) => PickNativeObjectonoffonce
    ): Self = StObject.set(x, "once", js.Any.fromFunction3(value))
    
    @scala.inline
    def setTrigger(value: /* type */ String => PickNativeObjectonoffonce): Self = StObject.set(x, "trigger", js.Any.fromFunction1(value))
  }
}
