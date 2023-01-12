package typings.systeminformation.mod.Systeminformation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DockerContainerProcessData extends StObject {
  
  var command: String
  
  var elapsed: String
  
  var group: String
  
  var nice: String
  
  var pgid: String
  
  var pidHost: String
  
  var ppid: String
  
  var rgroup: String
  
  var rss: String
  
  var ruser: String
  
  var stat: String
  
  var time: String
  
  var user: String
  
  var vsz: String
}
object DockerContainerProcessData {
  
  inline def apply(
    command: String,
    elapsed: String,
    group: String,
    nice: String,
    pgid: String,
    pidHost: String,
    ppid: String,
    rgroup: String,
    rss: String,
    ruser: String,
    stat: String,
    time: String,
    user: String,
    vsz: String
  ): DockerContainerProcessData = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], elapsed = elapsed.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], nice = nice.asInstanceOf[js.Any], pgid = pgid.asInstanceOf[js.Any], pidHost = pidHost.asInstanceOf[js.Any], ppid = ppid.asInstanceOf[js.Any], rgroup = rgroup.asInstanceOf[js.Any], rss = rss.asInstanceOf[js.Any], ruser = ruser.asInstanceOf[js.Any], stat = stat.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any], vsz = vsz.asInstanceOf[js.Any])
    __obj.asInstanceOf[DockerContainerProcessData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DockerContainerProcessData] (val x: Self) extends AnyVal {
    
    inline def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    inline def setElapsed(value: String): Self = StObject.set(x, "elapsed", value.asInstanceOf[js.Any])
    
    inline def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setNice(value: String): Self = StObject.set(x, "nice", value.asInstanceOf[js.Any])
    
    inline def setPgid(value: String): Self = StObject.set(x, "pgid", value.asInstanceOf[js.Any])
    
    inline def setPidHost(value: String): Self = StObject.set(x, "pidHost", value.asInstanceOf[js.Any])
    
    inline def setPpid(value: String): Self = StObject.set(x, "ppid", value.asInstanceOf[js.Any])
    
    inline def setRgroup(value: String): Self = StObject.set(x, "rgroup", value.asInstanceOf[js.Any])
    
    inline def setRss(value: String): Self = StObject.set(x, "rss", value.asInstanceOf[js.Any])
    
    inline def setRuser(value: String): Self = StObject.set(x, "ruser", value.asInstanceOf[js.Any])
    
    inline def setStat(value: String): Self = StObject.set(x, "stat", value.asInstanceOf[js.Any])
    
    inline def setTime(value: String): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setVsz(value: String): Self = StObject.set(x, "vsz", value.asInstanceOf[js.Any])
  }
}
