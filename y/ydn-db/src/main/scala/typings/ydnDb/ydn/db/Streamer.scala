package typings.ydnDb.ydn.db

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Streamer extends StObject {
  
  def collect(callback: js.Function1[/* values */ js.Array[js.Any], Unit]): js.Any = js.native
  
  def push(key: js.Any): js.Any = js.native
  def push(key: js.Any, value: js.Any): js.Any = js.native
  
  def setSink(
    callback: js.Function3[/* key */ js.Any, /* value */ js.Any, /* toWait */ js.Function0[Boolean], Unit]
  ): js.Any = js.native
}
