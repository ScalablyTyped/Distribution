package typings.yarnpkgLockfile

import typings.yarnpkgLockfile.mod.LockFileObject
import typings.yarnpkgLockfile.yarnpkgLockfileStrings.conflict
import typings.yarnpkgLockfile.yarnpkgLockfileStrings.merge
import typings.yarnpkgLockfile.yarnpkgLockfileStrings.success
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Object extends StObject {
    
    var `object`: LockFileObject
    
    var `type`: success | merge | conflict
  }
  object Object {
    
    inline def apply(`object`: LockFileObject, `type`: success | merge | conflict): Object = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Object]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Object] (val x: Self) extends AnyVal {
      
      inline def setObject(value: LockFileObject): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      inline def setType(value: success | merge | conflict): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
