package typings.uuidv4

import typings.uuidv4.anon.Pattern
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("uuidv4", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def empty(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")().asInstanceOf[String]
  
  inline def fromString(text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(text.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def fromString(text: String, namespace: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(text.asInstanceOf[js.Any], namespace.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def isUuid(value: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUuid")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  object jsonSchema {
    
    @JSImport("uuidv4", "jsonSchema")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("uuidv4", "jsonSchema.v4")
    @js.native
    def v4: Pattern = js.native
    inline def v4_=(x: Pattern): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v4")(x.asInstanceOf[js.Any])
    
    @JSImport("uuidv4", "jsonSchema.v5")
    @js.native
    def v5: Pattern = js.native
    inline def v5_=(x: Pattern): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v5")(x.asInstanceOf[js.Any])
  }
  
  object regex {
    
    @JSImport("uuidv4", "regex")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("uuidv4", "regex.v4")
    @js.native
    def v4: js.RegExp = js.native
    inline def v4_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v4")(x.asInstanceOf[js.Any])
    
    @JSImport("uuidv4", "regex.v5")
    @js.native
    def v5: js.RegExp = js.native
    inline def v5_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v5")(x.asInstanceOf[js.Any])
  }
  
  inline def uuid(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("uuid")().asInstanceOf[String]
}
