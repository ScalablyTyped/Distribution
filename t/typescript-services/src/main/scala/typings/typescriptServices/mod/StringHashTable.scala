package typings.typescriptServices.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "StringHashTable")
@js.native
class StringHashTable[T] ()
  extends StObject
     with typings.typescriptServices.TypeScript.StringHashTable[T] {
  
  /* CompleteClass */
  override def add(key: String, data: T): Boolean = js.native
  
  /* CompleteClass */
  override def addOrUpdate(key: String, data: T): Boolean = js.native
  
  /* CompleteClass */
  override def count(): Double = js.native
  
  /* CompleteClass */
  override def every(fn: js.Function3[/* k */ String, T, /* context */ js.Any, Unit], context: js.Any): Boolean = js.native
  
  /* CompleteClass */
  override def getAllKeys(): js.Array[String] = js.native
  
  /* CompleteClass */
  var itemCount: js.Any = js.native
  
  /* CompleteClass */
  override def lookup(key: String): T = js.native
  
  /* CompleteClass */
  override def map(fn: js.Function3[/* k */ String, T, /* context */ js.Any, Unit], context: js.Any): Unit = js.native
  
  /* CompleteClass */
  override def remove(key: String): Unit = js.native
  
  /* CompleteClass */
  override def some(fn: js.Function3[/* k */ String, T, /* context */ js.Any, Unit], context: js.Any): Boolean = js.native
  
  /* CompleteClass */
  var table: js.Any = js.native
}
