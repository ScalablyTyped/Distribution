package typings.websql

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** SQLResultSetRowList objects have a length attribute that must return the number of
  * rows it represents (the number of rows returned by the database). This is the length.
  * Fetching the length might be expensive, and authors are thus encouraged to avoid using
  * it (or enumerating over the object, which implicitly uses it) where possible.
  * The object's supported property indices are the numbers in the range zero to length-1,
  * unless the length is zero, in which case there are no supported property indices.
  * The item(index) attribute must return the row with the given index index.
  * If there is no such row, then the method must return null.
  *
  * Each row must be represented by a native ordered dictionary data type. In the
  * JavaScript binding, this must be Object. Each row object must have one property
  * (or dictionary entry) per column, with those properties enumerating in the order
  * that these columns were returned by the database. Each property must have the
  * name of the column and the value of the cell, as they were returned by the database
  */
trait SQLResultSetRowList extends StObject {
  
  def item(index: Double): js.Any
  
  var length: Double
}
object SQLResultSetRowList {
  
  @scala.inline
  def apply(item: Double => js.Any, length: Double): SQLResultSetRowList = {
    val __obj = js.Dynamic.literal(item = js.Any.fromFunction1(item), length = length.asInstanceOf[js.Any])
    __obj.asInstanceOf[SQLResultSetRowList]
  }
  
  @scala.inline
  implicit class SQLResultSetRowListMutableBuilder[Self <: SQLResultSetRowList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItem(value: Double => js.Any): Self = StObject.set(x, "item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
  }
}
