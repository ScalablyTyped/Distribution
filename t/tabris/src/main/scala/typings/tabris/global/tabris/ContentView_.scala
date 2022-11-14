package typings.tabris.global.tabris

import typings.tabris.anon.OmitContentViewWidgetanysAbsoluteBounds
import typings.tabris.mod.AnyWidget
import typings.tabris.mod.Properties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("tabris.ContentView")
@js.native
/**
  * A composite that does not require (or support) a parent to be visible. It also can not be disposed.
  * Every instance of `ContentView` is controlled by an associated non-widget object, either an instance
  * of `Popover` or the global `tabris` object.
  * 
  * This constructor can be called as a factory, without "new". Doing so allows passing an attributes
  * object which may include (in addition to the properties) children, event listeners and layout
  * shorthands.
  */
/* protected */ open class ContentView_[ChildType /* <: AnyWidget */] ()
  extends typings.tabris.mod.ContentView_[ChildType] {
  /* protected */ def this(properties: Properties[
        typings.tabris.mod.ContentView_[typings.tabris.mod.Widget[Any]], 
        OmitContentViewWidgetanysAbsoluteBounds[ChildType]
      ]) = this()
}
