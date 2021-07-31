package typings.yadda

import typings.std.Date
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object convertersMod {
  
  @JSImport("yadda/lib/converters", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def date(value: String, next: js.Function2[/* err */ Error | Null, /* value */ Date, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("date")(value.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def float(value: String, next: js.Function2[/* err */ Error | Null, /* value */ Double, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("float")(value.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def integer(value: String, next: js.Function2[/* err */ Error | Null, /* value */ Double, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("integer")(value.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def list(value: String, next: js.Function2[/* err */ Error | Null, /* value */ js.Array[String], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("list")(value.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def passThrough(value: String, next: js.Function2[/* err */ Error | Null, /* value */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("pass_through")(value.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def table(value: String, next: js.Function2[/* err */ Error | Null, /* value */ js.Array[String], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("table")(value.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
