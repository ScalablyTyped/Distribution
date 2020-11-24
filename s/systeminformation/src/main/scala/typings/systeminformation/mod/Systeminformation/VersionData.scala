package typings.systeminformation.mod.Systeminformation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VersionData extends js.Object {
  
  var docker: js.UndefOr[String] = js.native
  
  var dotnet: js.UndefOr[String] = js.native
  
  var gcc: js.UndefOr[String] = js.native
  
  var git: js.UndefOr[String] = js.native
  
  var grunt: js.UndefOr[String] = js.native
  
  var gulp: js.UndefOr[String] = js.native
  
  @JSName("java")
  var java_ : js.UndefOr[String] = js.native
  
  var kernel: js.UndefOr[String] = js.native
  
  var mongodb: js.UndefOr[String] = js.native
  
  var mysql: js.UndefOr[String] = js.native
  
  var nginx: js.UndefOr[String] = js.native
  
  var node: js.UndefOr[String] = js.native
  
  var npm: js.UndefOr[String] = js.native
  
  var openssl: js.UndefOr[String] = js.native
  
  var perl: js.UndefOr[String] = js.native
  
  var php: js.UndefOr[String] = js.native
  
  var pip: js.UndefOr[String] = js.native
  
  var pip3: js.UndefOr[String] = js.native
  
  var pm2: js.UndefOr[String] = js.native
  
  var postfix: js.UndefOr[String] = js.native
  
  var postgresql: js.UndefOr[String] = js.native
  
  var python: js.UndefOr[String] = js.native
  
  var python3: js.UndefOr[String] = js.native
  
  var redis: js.UndefOr[String] = js.native
  
  var systemOpenssl: js.UndefOr[String] = js.native
  
  var systemOpensslLib: js.UndefOr[String] = js.native
  
  var tsc: js.UndefOr[String] = js.native
  
  var v8: js.UndefOr[String] = js.native
  
  var virtualbox: js.UndefOr[String] = js.native
  
  var yarn: js.UndefOr[String] = js.native
}
object VersionData {
  
  @scala.inline
  def apply(): VersionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VersionData]
  }
  
  @scala.inline
  implicit class VersionDataOps[Self <: VersionData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDocker(value: String): Self = this.set("docker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocker: Self = this.set("docker", js.undefined)
    
    @scala.inline
    def setDotnet(value: String): Self = this.set("dotnet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDotnet: Self = this.set("dotnet", js.undefined)
    
    @scala.inline
    def setGcc(value: String): Self = this.set("gcc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGcc: Self = this.set("gcc", js.undefined)
    
    @scala.inline
    def setGit(value: String): Self = this.set("git", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGit: Self = this.set("git", js.undefined)
    
    @scala.inline
    def setGrunt(value: String): Self = this.set("grunt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGrunt: Self = this.set("grunt", js.undefined)
    
    @scala.inline
    def setGulp(value: String): Self = this.set("gulp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGulp: Self = this.set("gulp", js.undefined)
    
    @scala.inline
    def setJava_(value: String): Self = this.set("java", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJava_ : Self = this.set("java", js.undefined)
    
    @scala.inline
    def setKernel(value: String): Self = this.set("kernel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKernel: Self = this.set("kernel", js.undefined)
    
    @scala.inline
    def setMongodb(value: String): Self = this.set("mongodb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMongodb: Self = this.set("mongodb", js.undefined)
    
    @scala.inline
    def setMysql(value: String): Self = this.set("mysql", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMysql: Self = this.set("mysql", js.undefined)
    
    @scala.inline
    def setNginx(value: String): Self = this.set("nginx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNginx: Self = this.set("nginx", js.undefined)
    
    @scala.inline
    def setNode(value: String): Self = this.set("node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNode: Self = this.set("node", js.undefined)
    
    @scala.inline
    def setNpm(value: String): Self = this.set("npm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNpm: Self = this.set("npm", js.undefined)
    
    @scala.inline
    def setOpenssl(value: String): Self = this.set("openssl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpenssl: Self = this.set("openssl", js.undefined)
    
    @scala.inline
    def setPerl(value: String): Self = this.set("perl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePerl: Self = this.set("perl", js.undefined)
    
    @scala.inline
    def setPhp(value: String): Self = this.set("php", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhp: Self = this.set("php", js.undefined)
    
    @scala.inline
    def setPip(value: String): Self = this.set("pip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePip: Self = this.set("pip", js.undefined)
    
    @scala.inline
    def setPip3(value: String): Self = this.set("pip3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePip3: Self = this.set("pip3", js.undefined)
    
    @scala.inline
    def setPm2(value: String): Self = this.set("pm2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePm2: Self = this.set("pm2", js.undefined)
    
    @scala.inline
    def setPostfix(value: String): Self = this.set("postfix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePostfix: Self = this.set("postfix", js.undefined)
    
    @scala.inline
    def setPostgresql(value: String): Self = this.set("postgresql", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePostgresql: Self = this.set("postgresql", js.undefined)
    
    @scala.inline
    def setPython(value: String): Self = this.set("python", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePython: Self = this.set("python", js.undefined)
    
    @scala.inline
    def setPython3(value: String): Self = this.set("python3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePython3: Self = this.set("python3", js.undefined)
    
    @scala.inline
    def setRedis(value: String): Self = this.set("redis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRedis: Self = this.set("redis", js.undefined)
    
    @scala.inline
    def setSystemOpenssl(value: String): Self = this.set("systemOpenssl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSystemOpenssl: Self = this.set("systemOpenssl", js.undefined)
    
    @scala.inline
    def setSystemOpensslLib(value: String): Self = this.set("systemOpensslLib", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSystemOpensslLib: Self = this.set("systemOpensslLib", js.undefined)
    
    @scala.inline
    def setTsc(value: String): Self = this.set("tsc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTsc: Self = this.set("tsc", js.undefined)
    
    @scala.inline
    def setV8(value: String): Self = this.set("v8", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteV8: Self = this.set("v8", js.undefined)
    
    @scala.inline
    def setVirtualbox(value: String): Self = this.set("virtualbox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVirtualbox: Self = this.set("virtualbox", js.undefined)
    
    @scala.inline
    def setYarn(value: String): Self = this.set("yarn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYarn: Self = this.set("yarn", js.undefined)
  }
}
