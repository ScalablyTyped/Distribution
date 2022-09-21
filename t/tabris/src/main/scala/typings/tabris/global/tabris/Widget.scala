package typings.tabris.global.tabris

import typings.tabris.anon.OmitWidgetanysetAbsoluteBounds
import typings.tabris.mod.Properties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("tabris.Widget")
@js.native
/**
  * Base class for all widgets
  * 
  * This constructor can be called as a factory, without "new". Doing so allows passing an attributes
  * object which may include (in addition to the properties) children, event listeners and layout
  * shorthands.
  */
/* protected */ open class Widget[TData /* <: js.Object */] ()
  extends typings.tabris.mod.Widget[TData] {
  /* protected */ def this(properties: Properties[typings.tabris.mod.Widget[Any], OmitWidgetanysetAbsoluteBounds[TData]]) = this()
}
