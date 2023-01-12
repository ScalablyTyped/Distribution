package typings.vueRouter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouteRecordMatcher
  extends StObject
     with PathParser {
  
  var alias: js.Array[RouteRecordMatcher]
  
  var children: js.Array[RouteRecordMatcher]
  
  var parent: js.UndefOr[RouteRecordMatcher] = js.undefined
  
  var record: RouteRecord
}
object RouteRecordMatcher {
  
  inline def apply(
    alias: js.Array[RouteRecordMatcher],
    children: js.Array[RouteRecordMatcher],
    keys: js.Array[PathParserParamKey],
    parse: String => PathParams | Null,
    re: js.RegExp,
    record: RouteRecord,
    score: js.Array[js.Array[Double]],
    stringify: PathParams => String
  ): RouteRecordMatcher = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any], parse = js.Any.fromFunction1(parse), re = re.asInstanceOf[js.Any], record = record.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any], stringify = js.Any.fromFunction1(stringify))
    __obj.asInstanceOf[RouteRecordMatcher]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RouteRecordMatcher] (val x: Self) extends AnyVal {
    
    inline def setAlias(value: js.Array[RouteRecordMatcher]): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    inline def setAliasVarargs(value: RouteRecordMatcher*): Self = StObject.set(x, "alias", js.Array(value*))
    
    inline def setChildren(value: js.Array[RouteRecordMatcher]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenVarargs(value: RouteRecordMatcher*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setParent(value: RouteRecordMatcher): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRecord(value: RouteRecord): Self = StObject.set(x, "record", value.asInstanceOf[js.Any])
  }
}
