package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AndroidStudio extends js.Object {
  
  var androidStudio: scala.Double = js.native
  
  var appCode: scala.Double = js.native
  
  var cLion: scala.Double = js.native
  
  var dataGrip: scala.Double = js.native
  
  var eclipse: scala.Double = js.native
  
  var intelliJ: scala.Double = js.native
  
  var mPS: scala.Double = js.native
  
  var phpStorm: scala.Double = js.native
  
  var pyCharm: scala.Double = js.native
  
  var rubyMine: scala.Double = js.native
  
  var tower: scala.Double = js.native
  
  var unknown: scala.Double = js.native
  
  var visualStudio: scala.Double = js.native
  
  var webStorm: scala.Double = js.native
}
object AndroidStudio {
  
  @scala.inline
  def apply(
    androidStudio: scala.Double,
    appCode: scala.Double,
    cLion: scala.Double,
    dataGrip: scala.Double,
    eclipse: scala.Double,
    intelliJ: scala.Double,
    mPS: scala.Double,
    phpStorm: scala.Double,
    pyCharm: scala.Double,
    rubyMine: scala.Double,
    tower: scala.Double,
    unknown: scala.Double,
    visualStudio: scala.Double,
    webStorm: scala.Double
  ): AndroidStudio = {
    val __obj = js.Dynamic.literal(androidStudio = androidStudio.asInstanceOf[js.Any], appCode = appCode.asInstanceOf[js.Any], cLion = cLion.asInstanceOf[js.Any], dataGrip = dataGrip.asInstanceOf[js.Any], eclipse = eclipse.asInstanceOf[js.Any], intelliJ = intelliJ.asInstanceOf[js.Any], mPS = mPS.asInstanceOf[js.Any], phpStorm = phpStorm.asInstanceOf[js.Any], pyCharm = pyCharm.asInstanceOf[js.Any], rubyMine = rubyMine.asInstanceOf[js.Any], tower = tower.asInstanceOf[js.Any], unknown = unknown.asInstanceOf[js.Any], visualStudio = visualStudio.asInstanceOf[js.Any], webStorm = webStorm.asInstanceOf[js.Any])
    __obj.asInstanceOf[AndroidStudio]
  }
  
  @scala.inline
  implicit class AndroidStudioOps[Self <: AndroidStudio] (val x: Self) extends AnyVal {
    
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
    def setAndroidStudio(value: scala.Double): Self = this.set("androidStudio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppCode(value: scala.Double): Self = this.set("appCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCLion(value: scala.Double): Self = this.set("cLion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataGrip(value: scala.Double): Self = this.set("dataGrip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEclipse(value: scala.Double): Self = this.set("eclipse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntelliJ(value: scala.Double): Self = this.set("intelliJ", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMPS(value: scala.Double): Self = this.set("mPS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhpStorm(value: scala.Double): Self = this.set("phpStorm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPyCharm(value: scala.Double): Self = this.set("pyCharm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRubyMine(value: scala.Double): Self = this.set("rubyMine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTower(value: scala.Double): Self = this.set("tower", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnknown(value: scala.Double): Self = this.set("unknown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisualStudio(value: scala.Double): Self = this.set("visualStudio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebStorm(value: scala.Double): Self = this.set("webStorm", value.asInstanceOf[js.Any])
  }
}
