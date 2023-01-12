package typings.vite.mod

import typings.rollup.mod.InputOption
import typings.rollup.mod.ModuleFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LibraryOptions extends StObject {
  
  /**
    * Path of library entry
    */
  var entry: InputOption
  
  /**
    * The name of the package file output. The default file name is the name option
    * of the project package.json. It can also be defined as a function taking the
    * format as an argument.
    */
  var fileName: js.UndefOr[
    String | (js.Function2[/* format */ ModuleFormat, /* entryName */ String, String])
  ] = js.undefined
  
  /**
    * Output bundle formats
    * @default ['es', 'umd']
    */
  var formats: js.UndefOr[js.Array[LibraryFormats]] = js.undefined
  
  /**
    * The name of the exposed global variable. Required when the `formats` option includes
    * `umd` or `iife`
    */
  var name: js.UndefOr[String] = js.undefined
}
object LibraryOptions {
  
  inline def apply(entry: InputOption): LibraryOptions = {
    val __obj = js.Dynamic.literal(entry = entry.asInstanceOf[js.Any])
    __obj.asInstanceOf[LibraryOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LibraryOptions] (val x: Self) extends AnyVal {
    
    inline def setEntry(value: InputOption): Self = StObject.set(x, "entry", value.asInstanceOf[js.Any])
    
    inline def setEntryVarargs(value: String*): Self = StObject.set(x, "entry", js.Array(value*))
    
    inline def setFileName(value: String | (js.Function2[/* format */ ModuleFormat, /* entryName */ String, String])): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    inline def setFileNameFunction2(value: (/* format */ ModuleFormat, /* entryName */ String) => String): Self = StObject.set(x, "fileName", js.Any.fromFunction2(value))
    
    inline def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
    
    inline def setFormats(value: js.Array[LibraryFormats]): Self = StObject.set(x, "formats", value.asInstanceOf[js.Any])
    
    inline def setFormatsUndefined: Self = StObject.set(x, "formats", js.undefined)
    
    inline def setFormatsVarargs(value: LibraryFormats*): Self = StObject.set(x, "formats", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
