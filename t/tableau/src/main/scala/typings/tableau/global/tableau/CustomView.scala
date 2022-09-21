package typings.tableau.global.tableau

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("tableau.CustomView")
@js.native
open class CustomView ()
  extends StObject
     with typings.tableau.tableau.CustomView {
  
  /** Indicates whether the custom view is public or private. */
  /* CompleteClass */
  override def getAdvertised(): Boolean = js.native
  
  /** Gets or sets whether this is the default custom view. */
  /* CompleteClass */
  override def getDefault(): Boolean = js.native
  
  /** User-friendly name for the custom view */
  /* CompleteClass */
  override def getName(): String = js.native
  
  /** Gets the user that created the custom view. */
  /* CompleteClass */
  override def getOwnerName(): String = js.native
  
  /** Unique URL to load this view again. */
  /* CompleteClass */
  override def getUrl(): String = js.native
  
  /** Gets the Workbook to which this CustomView belongs. */
  /* CompleteClass */
  override def getWorkbook(): typings.tableau.tableau.Workbook = js.native
  
  /** After saveAsync() is called, the result of the getUrl method is no longer blank. */
  /* CompleteClass */
  override def saveAsync(): js.Promise[typings.tableau.tableau.CustomView] = js.native
  
  /** Indicates whether the custom view is public or private. */
  /* CompleteClass */
  override def setAdvertised(bool: Boolean): Boolean = js.native
  
  /** User-friendly name for the custom view */
  /* CompleteClass */
  override def setName(name: String): String = js.native
}
