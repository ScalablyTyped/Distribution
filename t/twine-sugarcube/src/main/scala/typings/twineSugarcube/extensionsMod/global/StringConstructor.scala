package typings.twineSugarcube.extensionsMod.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StringConstructor extends js.Object {
  
  /**
    * Returns a formatted string, after replacing each format item in the given format string with the text equivalent of the
    * corresponding argument's value.
    * @param format The format string, which consists of normal text and format items.
    * @param arguments Either a list of arguments, which correspond by-index to the format items within the format string, or an
    * array, whose members correspond by-index.
    *
    * A format item has the syntax {index[,alignment]}, square-brackets denoting optional elements.
    * * **index**: (integer) The (zero-based) index of the argument whose string representation will replace the format item.
    * * **alignment**: (optional, integer) The total length of the field into which the argument is inserted, and whether it's
    * right- or left-aligned (positive aligns right, negative aligns left).
    *
    * @since 2.0.0
    * @example
    * String.format("{0}, {1}!", "Hello", "World"); //List of arguments; Returns "Hello, World!"
    * String.format("{0}, {1}!", [ "Hello", "World" ]); //Array argument; Returns "Hello, World!"
    * String.format("{0,6}", "foo"); // Returns "   foo"
    * String.format("{0,-6}", "foo"); //Returns "foo   "
    */
  def format(format: java.lang.String, arguments: js.Any*): java.lang.String = js.native
}
object StringConstructor {
  
  @scala.inline
  def apply(format: (java.lang.String, /* repeated */ js.Any) => java.lang.String): StringConstructor = {
    val __obj = js.Dynamic.literal(format = js.Any.fromFunction2(format))
    __obj.asInstanceOf[StringConstructor]
  }
  
  @scala.inline
  implicit class StringConstructorOps[Self <: StringConstructor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFormat(value: (java.lang.String, /* repeated */ js.Any) => java.lang.String): Self = this.set("format", js.Any.fromFunction2(value))
  }
}
