package typings.wordpressCustomizeBrowser

import typings.jquery.JQuery.Callbacks
import typings.jquery.JQuery.Deferred
import typings.jquery.JQuery.Promise
import typings.std.Record
import typings.wordpressCustomizeBrowser.classMod.Class
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object valuesMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.wordpressCustomizeBrowser.eventsMod.Events because Inheritance from two classes. Inlined topics, trigger, bind, unbind */ @JSImport("@wordpress/customize-browser/Values", "Values")
  @js.native
  class Values[T] protected () extends Class {
    def this(applicator: js.Object, argsArray: js.Object) = this()
    def this(applicator: js.Object, argsArray: js.Object, options: js.Object) = this()
    
    def apply(arg: String): T = js.native
    def apply(args: (String | (js.Function1[/* repeated */ T, Unit]))*): Promise[_, _, _] = js.native
    
    def _change(): Unit = js.native
    
    var _deferreds: Record[String, Deferred[_, _, _]] = js.native
    
    var _value: Record[String, T] = js.native
    
    def add(item: T): T = js.native
    def add(item: T, itemObject: T): T = js.native
    def add(item: String): T = js.native
    def add(item: String, itemObject: T): T = js.native
    
    def bind(id: String): this.type = js.native
    
    def create(id: String, value: js.Object): T = js.native
    
    var defaultConstructor: T = js.native
    
    def each[T](callback: js.Function3[/* context */ T, /* obj */ T, /* key */ String, Unit]): Unit = js.native
    def each[T](callback: js.Function3[/* context */ T, /* obj */ T, /* key */ String, Unit], context: T): Unit = js.native
    
    def has(id: String): Boolean = js.native
    
    def initialize(): Unit = js.native
    def initialize(options: js.Object): Unit = js.native
    
    def instance(arg: String): T = js.native
    def instance(args: (String | (js.Function1[/* repeated */ T, Unit]))*): Promise[_, _, _] = js.native
    
    def remove(id: String): Unit = js.native
    
    // TODO: class with statics instead?
    var topics: Record[String, Callbacks[js.Function]] = js.native
    
    def trigger(id: String): this.type = js.native
    
    def unbind(id: String): this.type = js.native
    
    def value(id: String): T = js.native
    
    def when(args: (String | (js.Function1[/* repeated */ T, Unit]))*): Promise[_, _, _] = js.native
  }
}
