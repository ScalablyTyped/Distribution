package typings.yaml.anon

import typings.std.Record
import typings.yaml.distNodesPairMod.Pair
import typings.yaml.distOptionsMod.SchemaOptions
import typings.yaml.distSchemaTypesMod.CollectionTag
import typings.yaml.distSchemaTypesMod.ScalarTag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<yaml.yaml/dist/schema/Schema.Schema> */
trait ReadonlySchema extends StObject {
  
  val compat: js.UndefOr[(js.Array[CollectionTag | ScalarTag]) | Null] = js.undefined
  
  val knownTags: Record[String, CollectionTag | ScalarTag]
  
  val merge: Boolean
  
  val name: String
  
  val sortMapEntries: js.UndefOr[(js.Function2[/* a */ Pair[Any, Any], /* b */ Pair[Any, Any], Double]) | Null] = js.undefined
  
  val tags: js.Array[CollectionTag | ScalarTag]
  
  val toStringOptions: js.UndefOr[ReadonlyToStringOptions | Null] = js.undefined
}
object ReadonlySchema {
  
  inline def apply(
    knownTags: Record[String, CollectionTag | ScalarTag],
    merge: Boolean,
    name: String,
    tags: js.Array[CollectionTag | ScalarTag]
  ): ReadonlySchema = {
    val __obj = js.Dynamic.literal(knownTags = knownTags.asInstanceOf[js.Any], merge = merge.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlySchema]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReadonlySchema] (val x: Self) extends AnyVal {
    
    inline def setCompat(value: js.Array[CollectionTag | ScalarTag]): Self = StObject.set(x, "compat", value.asInstanceOf[js.Any])
    
    inline def setCompatNull: Self = StObject.set(x, "compat", null)
    
    inline def setCompatUndefined: Self = StObject.set(x, "compat", js.undefined)
    
    inline def setCompatVarargs(value: (CollectionTag | ScalarTag)*): Self = StObject.set(x, "compat", js.Array(value*))
    
    inline def setKnownTags(value: Record[String, CollectionTag | ScalarTag]): Self = StObject.set(x, "knownTags", value.asInstanceOf[js.Any])
    
    inline def setMerge(value: Boolean): Self = StObject.set(x, "merge", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSortMapEntries(value: (/* a */ Pair[Any, Any], /* b */ Pair[Any, Any]) => Double): Self = StObject.set(x, "sortMapEntries", js.Any.fromFunction2(value))
    
    inline def setSortMapEntriesNull: Self = StObject.set(x, "sortMapEntries", null)
    
    inline def setSortMapEntriesUndefined: Self = StObject.set(x, "sortMapEntries", js.undefined)
    
    inline def setTags(value: js.Array[CollectionTag | ScalarTag]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsVarargs(value: (CollectionTag | ScalarTag)*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setToStringOptions(value: ReadonlyToStringOptions): Self = StObject.set(x, "toStringOptions", value.asInstanceOf[js.Any])
    
    inline def setToStringOptionsNull: Self = StObject.set(x, "toStringOptions", null)
    
    inline def setToStringOptionsUndefined: Self = StObject.set(x, "toStringOptions", js.undefined)
  }
}
