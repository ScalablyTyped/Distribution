package typings.systeminformation.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Argv extends StObject {
  
  var argv: js.Array[java.lang.String]
  
  var build_info: java.lang.String
  
  var exit_status: Double
  
  var platform_info: java.lang.String
  
  var version: js.Array[Double]
}
object Argv {
  
  @scala.inline
  def apply(
    argv: js.Array[java.lang.String],
    build_info: java.lang.String,
    exit_status: Double,
    platform_info: java.lang.String,
    version: js.Array[Double]
  ): Argv = {
    val __obj = js.Dynamic.literal(argv = argv.asInstanceOf[js.Any], build_info = build_info.asInstanceOf[js.Any], exit_status = exit_status.asInstanceOf[js.Any], platform_info = platform_info.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Argv]
  }
  
  @scala.inline
  implicit class ArgvMutableBuilder[Self <: Argv] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgv(value: js.Array[java.lang.String]): Self = StObject.set(x, "argv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgvVarargs(value: java.lang.String*): Self = StObject.set(x, "argv", js.Array(value :_*))
    
    @scala.inline
    def setBuild_info(value: java.lang.String): Self = StObject.set(x, "build_info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExit_status(value: Double): Self = StObject.set(x, "exit_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatform_info(value: java.lang.String): Self = StObject.set(x, "platform_info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: js.Array[Double]): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionVarargs(value: Double*): Self = StObject.set(x, "version", js.Array(value :_*))
  }
}
