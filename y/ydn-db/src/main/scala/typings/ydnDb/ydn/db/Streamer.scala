package typings.ydnDb.ydn.db

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Streamer extends StObject {
  
  def collect(callback: js.Function1[/* values */ js.Array[Any], Unit]): Any = js.native
  
  def push(key: Any): Any = js.native
  def push(key: Any, value: Any): Any = js.native
  
  def setSink(callback: js.Function3[/* key */ Any, /* value */ Any, /* toWait */ js.Function0[Boolean], Unit]): Any = js.native
}
