package typings.yaireoTagify.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Generic tag format that requires only a value and allows other
  * properties.
  *
  * `value` property must be unique, i.e. no two different tags may share the
  * same value.
  *
  * Note to TypeScript users: you can parametrize the tagify instance with a
  * type parameter that extends from `BaseTagData` instead for additional
  * type safety.
  */
trait TagData
  extends StObject
     with BaseTagData
     with /* key */ StringDictionary[Any]
object TagData {
  
  inline def apply(value: String): TagData = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagData]
  }
}
