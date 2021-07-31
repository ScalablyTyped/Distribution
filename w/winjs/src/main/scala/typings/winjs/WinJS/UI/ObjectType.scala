package typings.winjs.WinJS.UI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ObjectType extends StObject
/**
  * Describes the type of object in a ListView.
  **/
@JSGlobal("WinJS.UI.ObjectType")
@js.native
object ObjectType extends StObject {
  
  /**
    * The object is the footer for the list.
    **/
  @js.native
  sealed trait footer
    extends StObject
       with ObjectType
  
  /**
    * The object is a group header in the list.
    **/
  @js.native
  sealed trait groupHeader
    extends StObject
       with ObjectType
  
  /**
    * The object is the header for the list.
    **/
  @js.native
  sealed trait header
    extends StObject
       with ObjectType
  
  /**
    * The object is an item in the list.
    **/
  @js.native
  sealed trait item
    extends StObject
       with ObjectType
}
