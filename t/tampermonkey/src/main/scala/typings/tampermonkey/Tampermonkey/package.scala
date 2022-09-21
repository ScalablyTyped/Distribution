package typings.tampermonkey.Tampermonkey

import org.scalablytyped.runtime.StringDictionary
import typings.tampermonkey.anon.Mimetype
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ContentType = String | Mimetype

type NotificationOnClick = js.ThisFunction0[/* this */ NotificationThis, Unit]

/** `clicked` is `true` when `text` was set */
type NotificationOnDone = js.ThisFunction1[/* this */ NotificationThis, /* clicked */ Boolean, Unit]

type RequestEventListener[TResponse] = js.ThisFunction1[/* this */ TResponse, /* response */ TResponse, Unit]

// Request
type RequestHeaders = StringDictionary[String]

type ValueChangeListener = js.Function4[/* name */ String, /* oldValue */ Any, /* newValue */ Any, /* remote */ Boolean, Unit]
