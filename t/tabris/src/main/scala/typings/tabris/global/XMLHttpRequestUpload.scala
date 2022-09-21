package typings.tabris.global

import typings.tabris.EventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("XMLHttpRequestUpload")
@js.native
open class XMLHttpRequestUpload ()
  extends StObject
     with typings.tabris.XMLHttpRequestUpload {
  
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, listener: EventListener): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, listener: EventListener, useCapture: Boolean): Unit = js.native
}
