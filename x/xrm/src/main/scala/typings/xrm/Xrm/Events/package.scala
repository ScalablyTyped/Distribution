package typings.xrm.Xrm.Events

import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/**
  * Type for a context-sensitive handler.
  * @param context The context.
  */
type ContextSensitiveHandler = js.Function1[/* context */ EventContext, Unit]

type DataLoadEventHandler = js.Function1[/* context */ DataLoadEventContext, Unit]

type LoadEventHandler = js.Function1[/* context */ LoadEventContext, Unit]

type LoadEventHandlerAsync = js.Function1[/* context */ LoadEventContextAsync, Unit]

type LookupTagClickHandler = js.Function1[/* context */ LookupTagClickEventContext, Unit]

type PostSaveEventHandler = js.Function1[/* context */ EventContext, Unit]

type ProcessStatusChangeHandler = js.Function1[/* context */ ProcessStatusChangedEventContext, Unit]

type SaveEventHandler = js.Function1[/* context */ SaveEventContext, Unit]

type SaveEventHandlerAsync = js.Function1[/* context */ SaveEventContextAsync, PromiseLike[Unit]]
