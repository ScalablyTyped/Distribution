package typings.urlState

import org.scalablytyped.runtime.StringDictionary
import typings.qs.anon.IParseOptionsdecodernever
import typings.qs.mod.IParseOptions
import typings.qs.mod.ParsedQs
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(str: String): ParsedQs = js.native
    def apply(str: String, options: IParseOptionsdecodernever): ParsedQs = js.native
    def apply(str: String, options: IParseOptions): StringDictionary[Any] = js.native
    def apply(str: Record[String, String]): StringDictionary[Any] = js.native
    def apply(str: Record[String, String], options: IParseOptions): StringDictionary[Any] = js.native
  }
}
