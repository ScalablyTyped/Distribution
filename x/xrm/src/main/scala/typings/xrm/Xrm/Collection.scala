package typings.xrm.Xrm

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A definition module for collection interface declarations.
  */
object Collection {
  
  /**
    * Defines collections that are index-able by string
    * @param Generic type parameter.
    */
  type Dictionary[T] = StringDictionary[T]
  
  /**
    * Collections are structures to provide access to data that represent an array, but without the ability to modify the data in the array.
    * @see {@link https://learn.microsoft.com/en-us/power-apps/developer/model-driven-apps/clientapi/reference/collections External Link: Collections (Client API reference)}
    */
  @js.native
  trait ItemCollection[T] extends StObject {
    
    /**
      * Applies an operation to all items in this collection.
      * @param delegate An iterative delegate function
      */
    def forEach(delegate: IterativeDelegate[T]): Unit = js.native
    
    /**
      * Gets the entire array of T.
      * @returns A T[].
      */
    def get(): js.Array[T] = js.native
    /**
      * Gets the item using a delegate matching function
      * @param delegate A matching delegate function
      * @returns A T[] whose members have been validated by delegate.
      */
    def get(delegate: MatchingDelegate[T]): js.Array[T] = js.native
    /**
      * Gets the item given by the key.
      * @param itemName The item name to get.
      * @returns The T matching the key itemName.
      * @see {@link Controls.Control.getName Controls.Control.getName()} for Control-naming schemes.
      */
    def get(itemName: String): T = js.native
    /**
      * Gets the item given by the index.
      * @param itemNumber The item number to get.
      * @returns The T in the itemNumber-th place.
      */
    def get(itemNumber: Double): T = js.native
    
    /**
      * Gets the length of the collection.
      * @returns The length.
      */
    def getLength(): Double = js.native
    
    /**
      * Gets the item given by the key.
      * @param itemName The item name to get.
      * @returns The T matching the key itemName.
      * @see {@link Controls.Control.getName Controls.Control.getName()} for Control-naming schemes.
      */
    @JSName("get")
    def get_TSubType_TSubType[TSubType /* <: T */](attributeName: String): TSubType = js.native
    /**
      * Gets the item given by the index.
      * @param itemNumber The item number to get.
      * @returns The T in the itemNumber-th place.
      * @see {@link Controls.Control.getName Controls.Control.getName()} for Control-naming schemes.
      */
    @JSName("get")
    def get_TSubType_TSubType[TSubType /* <: T */](itemNumber: Double): TSubType = js.native
  }
  
  /**
    * Called for each item in an array
    * @param item The item.
    * @param index Zero-based index of the item array.
    */
  type IterativeDelegate[T] = js.Function2[/* item */ T, /* index */ js.UndefOr[Double], Unit]
  
  /**
    * Called for each item in an array
    * @param item The item.
    * @param index Zero-based index of the item array.
    * @returns true if the item matches, false if it does not.
    */
  type MatchingDelegate[T] = js.Function2[/* item */ T, /* index */ js.UndefOr[Double], Boolean]
  
  /**
    * Defines item collections that are index-able by string
    * @param Generic type parameter.
    */
  @js.native
  trait StringIndexableItemCollection[T]
    extends StObject
       with Dictionary[T]
       with ItemCollection[T]
}
