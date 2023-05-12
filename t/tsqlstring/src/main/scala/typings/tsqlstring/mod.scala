package typings.tsqlstring

import typings.tsqlstring.anon.ToSqlString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("tsqlstring", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def arrayToList(array: js.Array[String], timeZone: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayToList")(array.asInstanceOf[js.Any], timeZone.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def bufferToString(buffer: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("bufferToString")(buffer.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def dateToString(date: String, timeZone: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("dateToString")(date.asInstanceOf[js.Any], timeZone.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def dateToString(date: js.Date, timeZone: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("dateToString")(date.asInstanceOf[js.Any], timeZone.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def dateToString(date: Double, timeZone: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("dateToString")(date.asInstanceOf[js.Any], timeZone.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def escape(value: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escape")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def escape(value: Any, stringifyObjects: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("escape")(value.asInstanceOf[js.Any], stringifyObjects.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def escape(value: Any, stringifyObjects: Boolean, timeZone: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("escape")(value.asInstanceOf[js.Any], stringifyObjects.asInstanceOf[js.Any], timeZone.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def escape(value: Any, stringifyObjects: Unit, timeZone: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("escape")(value.asInstanceOf[js.Any], stringifyObjects.asInstanceOf[js.Any], timeZone.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def escapeId(value: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeId")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def escapeId(value: Any, forbidQualified: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("escapeId")(value.asInstanceOf[js.Any], forbidQualified.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def format(sql: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("format")(sql.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def format(sql: String, args: js.Array[Any]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(sql.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def format(sql: String, args: js.Array[Any], stringifyObjects: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(sql.asInstanceOf[js.Any], args.asInstanceOf[js.Any], stringifyObjects.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def format(sql: String, args: js.Array[Any], stringifyObjects: Boolean, timeZone: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(sql.asInstanceOf[js.Any], args.asInstanceOf[js.Any], stringifyObjects.asInstanceOf[js.Any], timeZone.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def format(sql: String, args: js.Array[Any], stringifyObjects: Unit, timeZone: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(sql.asInstanceOf[js.Any], args.asInstanceOf[js.Any], stringifyObjects.asInstanceOf[js.Any], timeZone.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def format(sql: String, args: js.Object): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(sql.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def format(sql: String, args: js.Object, stringifyObjects: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(sql.asInstanceOf[js.Any], args.asInstanceOf[js.Any], stringifyObjects.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def format(sql: String, args: js.Object, stringifyObjects: Boolean, timeZone: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(sql.asInstanceOf[js.Any], args.asInstanceOf[js.Any], stringifyObjects.asInstanceOf[js.Any], timeZone.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def format(sql: String, args: js.Object, stringifyObjects: Unit, timeZone: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(sql.asInstanceOf[js.Any], args.asInstanceOf[js.Any], stringifyObjects.asInstanceOf[js.Any], timeZone.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def format(sql: String, args: Unit, stringifyObjects: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(sql.asInstanceOf[js.Any], args.asInstanceOf[js.Any], stringifyObjects.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def format(sql: String, args: Unit, stringifyObjects: Boolean, timeZone: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(sql.asInstanceOf[js.Any], args.asInstanceOf[js.Any], stringifyObjects.asInstanceOf[js.Any], timeZone.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def format(sql: String, args: Unit, stringifyObjects: Unit, timeZone: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(sql.asInstanceOf[js.Any], args.asInstanceOf[js.Any], stringifyObjects.asInstanceOf[js.Any], timeZone.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def objectToValues(`object`: js.Object, timeZone: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("objectToValues")(`object`.asInstanceOf[js.Any], timeZone.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def raw(sql: String): ToSqlString = ^.asInstanceOf[js.Dynamic].applyDynamic("raw")(sql.asInstanceOf[js.Any]).asInstanceOf[ToSqlString]
}
