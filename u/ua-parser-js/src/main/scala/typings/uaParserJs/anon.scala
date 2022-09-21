package typings.uaParserJs

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.std.Record
import typings.uaParserJs.mod.IResult
import typings.uaParserJs.mod.UAParserInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Call
    extends StObject
       with /**
    * Create a new parser with UA prepopulated and extensions extended
    */
  Instantiable0[UAParserInstance]
       with Instantiable1[(/* extensions */ Record[String, Any]) | (/* uastring */ String), UAParserInstance]
       with Instantiable2[
          (/* uastring */ String) | (/* uastring */ Unit), 
          /* extensions */ Record[String, Any], 
          UAParserInstance
        ] {
    
    def apply(): IResult = js.native
    def apply(extensions: Record[String, Any]): IResult = js.native
    def apply(uastring: String): IResult = js.native
    def apply(uastring: String, extensions: Record[String, Any]): IResult = js.native
    def apply(uastring: Unit, extensions: Record[String, Any]): IResult = js.native
    
    var BROWSER: typings.uaParserJs.mod.BROWSER = js.native
    
    var CPU: typings.uaParserJs.mod.CPU = js.native
    
    var DEVICE: typings.uaParserJs.mod.DEVICE = js.native
    
    var ENGINE: typings.uaParserJs.mod.ENGINE = js.native
    
    var OS: typings.uaParserJs.mod.OS = js.native
    
    var VERSION: String = js.native
  }
  
  @js.native
  trait TypeofuaParserJs extends StObject {
    
    def apply(): IResult = js.native
    def apply(extensions: Record[String, Any]): IResult = js.native
    def apply(uastring: String): IResult = js.native
    def apply(uastring: String, extensions: Record[String, Any]): IResult = js.native
    def apply(uastring: Unit, extensions: Record[String, Any]): IResult = js.native
  }
}
