package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyManagerAlias extends StObject {
  
  /**
    * Flag indicating whether key is password-protected. This property is set only when returning object by
    * [getDataAliasList()](#KeyManager::getDataAliasList) method.
    * In other methods which use this dictionary, the value is ignored.
    *
    * Possible values:
    *
    * *   true - data under the alias is password-protected,
    * *   false - data under the alias is not password-protected.
    *
    * @since 5.5
    */
  var isProtected: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Name which describes the item.
    *
    * If this attribute contains any spaces, the spaces will be removed. Characters which are separated by spaces will be concatenated.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Package ID of the application which saved the item into the KeyManager.
    */
  var packageId: js.UndefOr[PackageId] = js.undefined
}
object KeyManagerAlias {
  
  inline def apply(): KeyManagerAlias = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyManagerAlias]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KeyManagerAlias] (val x: Self) extends AnyVal {
    
    inline def setIsProtected(value: Boolean): Self = StObject.set(x, "isProtected", value.asInstanceOf[js.Any])
    
    inline def setIsProtectedUndefined: Self = StObject.set(x, "isProtected", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPackageId(value: PackageId): Self = StObject.set(x, "packageId", value.asInstanceOf[js.Any])
    
    inline def setPackageIdUndefined: Self = StObject.set(x, "packageId", js.undefined)
  }
}
