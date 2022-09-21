package typings.webcryptoCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Base generic class for crypto storages
  */
trait CryptoStorage[T] extends StObject {
  
  /**
    * Removes all items from storage
    */
  def clear(): js.Promise[Unit]
  
  /**
    * Returns crypto item from storage by index
    * @param index index of crypto item
    * @returns Crypto item
    * @throws Throws Error when cannot find crypto item in storage
    */
  def getItem(index: String): js.Promise[T]
  
  /**
    * Returns `true` if item is in storage otherwise `false`
    * @param item Crypto item
    */
  def hasItem(item: T): js.Promise[Boolean]
  
  /**
    * Returns index of item in storage
    * @param item Crypto item
    * @returns Index of item in storage otherwise null
    */
  def indexOf(item: T): js.Promise[String | Null]
  
  /**
    * Returns list of indexes from storage
    */
  def keys(): js.Promise[js.Array[String]]
  
  /**
    * Removes crypto item from storage by index
    * @param index Index of crypto storage
    */
  def removeItem(index: String): js.Promise[Unit]
  
  /**
    * Add crypto item to storage and returns it's index
    */
  def setItem(item: T): js.Promise[String]
}
object CryptoStorage {
  
  inline def apply[T](
    clear: () => js.Promise[Unit],
    getItem: String => js.Promise[T],
    hasItem: T => js.Promise[Boolean],
    indexOf: T => js.Promise[String | Null],
    keys: () => js.Promise[js.Array[String]],
    removeItem: String => js.Promise[Unit],
    setItem: T => js.Promise[String]
  ): CryptoStorage[T] = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), getItem = js.Any.fromFunction1(getItem), hasItem = js.Any.fromFunction1(hasItem), indexOf = js.Any.fromFunction1(indexOf), keys = js.Any.fromFunction0(keys), removeItem = js.Any.fromFunction1(removeItem), setItem = js.Any.fromFunction1(setItem))
    __obj.asInstanceOf[CryptoStorage[T]]
  }
  
  extension [Self <: CryptoStorage[?], T](x: Self & CryptoStorage[T]) {
    
    inline def setClear(value: () => js.Promise[Unit]): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    
    inline def setGetItem(value: String => js.Promise[T]): Self = StObject.set(x, "getItem", js.Any.fromFunction1(value))
    
    inline def setHasItem(value: T => js.Promise[Boolean]): Self = StObject.set(x, "hasItem", js.Any.fromFunction1(value))
    
    inline def setIndexOf(value: T => js.Promise[String | Null]): Self = StObject.set(x, "indexOf", js.Any.fromFunction1(value))
    
    inline def setKeys(value: () => js.Promise[js.Array[String]]): Self = StObject.set(x, "keys", js.Any.fromFunction0(value))
    
    inline def setRemoveItem(value: String => js.Promise[Unit]): Self = StObject.set(x, "removeItem", js.Any.fromFunction1(value))
    
    inline def setSetItem(value: T => js.Promise[String]): Self = StObject.set(x, "setItem", js.Any.fromFunction1(value))
  }
}
