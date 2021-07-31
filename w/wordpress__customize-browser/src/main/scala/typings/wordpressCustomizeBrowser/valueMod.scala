package typings.wordpressCustomizeBrowser

import typings.jquery.JQuery.Callbacks
import typings.jquery.JQuery.TypeOrArray
import typings.wordpressCustomizeBrowser.classMod.Class
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object valueMod {
  
  @JSImport("@wordpress/customize-browser/Value", "Value")
  @js.native
  class Value[T] protected () extends Class {
    def this(applicator: js.Object, argsArray: js.Object) = this()
    def this(applicator: js.Object, argsArray: js.Object, options: js.Object) = this()
    
    def apply(): T = js.native
    def apply(args: T): this.type = js.native
    
    var _dirty: Boolean = js.native
    
    def _setter(to: T): T = js.native
    
    var _value: T = js.native
    
    def bind(args: (TypeOrArray[js.Function2[/* to */ T, /* from */ T, Unit]])*): this.type = js.native
    
    var callbacks: Callbacks[js.Function] = js.native
    
    def get(): T = js.native
    
    def initialize(): Unit = js.native
    def initialize(initial: T): Unit = js.native
    def initialize(initial: T, options: js.Object): Unit = js.native
    def initialize(initial: String): Unit = js.native
    def initialize(initial: String, options: js.Object): Unit = js.native
    def initialize(initial: Unit, options: js.Object): Unit = js.native
    
    def instance(args: T): this.type | T = js.native
    
    def link(args: (TypeOrArray[js.Function2[/* to */ T, /* from */ T, Unit]])*): this.type = js.native
    
    def resetSetter(): this.type = js.native
    
    def set(to: T): this.type = js.native
    
    def setter(callback: js.Function1[/* to */ T, T]): this.type = js.native
    
    def sync(args: (TypeOrArray[js.Function2[/* to */ T, /* from */ T, Unit]])*): this.type = js.native
    
    def unbind(args: (TypeOrArray[js.Function2[/* to */ T, /* from */ T, Unit]])*): this.type = js.native
    
    def unlink(args: (TypeOrArray[js.Function2[/* to */ T, /* from */ T, Unit]])*): this.type = js.native
    
    def unsync(args: (TypeOrArray[js.Function2[/* to */ T, /* from */ T, Unit]])*): this.type = js.native
    
    def validate(value: T): T = js.native
  }
}
