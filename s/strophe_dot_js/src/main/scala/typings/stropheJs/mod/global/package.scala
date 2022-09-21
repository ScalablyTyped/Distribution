package typings.stropheJs.mod.global

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def BOSH_WAIT: /* 59 */ Double = js.Dynamic.global.selectDynamic("BOSH_WAIT").asInstanceOf[/* 59 */ Double]

/** Function: $build
  *  Create a Strophe.Builder.
  *  This is an alias for 'new Strophe.Builder(name, attrs)'.
  *
  *  Parameters:
  *    @param name - The root element name.
  *    @param attrs - The attributes for the root element in object notation.
  *
  *  Returns:
  *    @returns A new Strophe.Builder object.
  */
inline def build(name: String): Any = js.Dynamic.global.applyDynamic("$build")(name.asInstanceOf[js.Any]).asInstanceOf[Any]
inline def build(name: String, attrs: Record[String, String]): Any = (js.Dynamic.global.applyDynamic("$build")(name.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any])).asInstanceOf[Any]

/** Function: $iq
  *  Create a Strophe.Builder with an <iq/> element as the root.
  *
  *  Parameters:
  *    @param attrs - The <iq/> element attributes in object notation.
  *
  *  Returns:
  *    @returns A new Strophe.Builder object.
  */
inline def iq(): Any = js.Dynamic.global.applyDynamic("$iq")().asInstanceOf[Any]
inline def iq(attrs: Record[String, String]): Any = js.Dynamic.global.applyDynamic("$iq")(attrs.asInstanceOf[js.Any]).asInstanceOf[Any]

/** Function: $msg
  *  Create a Strophe.Builder with a <message/> element as the root.
  *
  *  Parameters:
  *    @param attrs - The <message/> element attributes in object notation.
  *
  *  Returns:
  *    @returns A new Strophe.Builder object.
  */
inline def msg(): Any = js.Dynamic.global.applyDynamic("$msg")().asInstanceOf[Any]
inline def msg(attrs: Record[String, String]): Any = js.Dynamic.global.applyDynamic("$msg")(attrs.asInstanceOf[js.Any]).asInstanceOf[Any]

/** Function: $pres
  *  Create a Strophe.Builder with a <presence/> element as the root.
  *
  *  Parameters:
  *    @param attrs - The <presence/> element attributes in object notation.
  *
  *  Returns:
  *    @returns A new Strophe.Builder object.
  */
inline def pres(): Any = js.Dynamic.global.applyDynamic("$pres")().asInstanceOf[Any]
inline def pres(attrs: Record[String, String]): Any = js.Dynamic.global.applyDynamic("$pres")(attrs.asInstanceOf[js.Any]).asInstanceOf[Any]
