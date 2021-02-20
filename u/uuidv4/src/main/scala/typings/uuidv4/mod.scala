package typings.uuidv4

import typings.std.RegExp
import typings.uuidv4.anon.Pattern
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("uuidv4", "empty")
  @js.native
  def empty(): String = js.native
  
  @JSImport("uuidv4", "fromString")
  @js.native
  def fromString(text: String): String = js.native
  @JSImport("uuidv4", "fromString")
  @js.native
  def fromString(text: String, namespace: String): String = js.native
  
  @JSImport("uuidv4", "isUuid")
  @js.native
  def isUuid(value: String): Boolean = js.native
  
  object jsonSchema {
    
    @JSImport("uuidv4", "jsonSchema")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("uuidv4", "jsonSchema.v4")
    @js.native
    def v4: Pattern = js.native
    @scala.inline
    def v4_=(x: Pattern): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v4")(x.asInstanceOf[js.Any])
    
    @JSImport("uuidv4", "jsonSchema.v5")
    @js.native
    def v5: Pattern = js.native
    @scala.inline
    def v5_=(x: Pattern): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v5")(x.asInstanceOf[js.Any])
  }
  
  object regex {
    
    @JSImport("uuidv4", "regex")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("uuidv4", "regex.v4")
    @js.native
    def v4: RegExp = js.native
    @scala.inline
    def v4_=(x: RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v4")(x.asInstanceOf[js.Any])
    
    @JSImport("uuidv4", "regex.v5")
    @js.native
    def v5: RegExp = js.native
    @scala.inline
    def v5_=(x: RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v5")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("uuidv4", "uuid")
  @js.native
  def uuid(): String = js.native
}
