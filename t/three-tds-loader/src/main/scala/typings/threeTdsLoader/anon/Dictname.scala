package typings.threeTdsLoader.anon

import org.scalablytyped.runtime.StringDictionary
import typings.three.shaderLibMod.Shader
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dictname extends /* name */ StringDictionary[Shader] {
  var background: Shader = js.native
  var basic: Shader = js.native
  var cube: Shader = js.native
  var dashed: Shader = js.native
  var depth: Shader = js.native
  var distanceRGBA: Shader = js.native
  var equirect: Shader = js.native
  var lambert: Shader = js.native
  var matcap: Shader = js.native
  var normal: Shader = js.native
  var phong: Shader = js.native
  var physical: Shader = js.native
  var points: Shader = js.native
  var shadow: Shader = js.native
  var sprite: Shader = js.native
  var standard: Shader = js.native
}

object Dictname {
  @scala.inline
  def apply(
    background: Shader,
    basic: Shader,
    cube: Shader,
    dashed: Shader,
    depth: Shader,
    distanceRGBA: Shader,
    equirect: Shader,
    lambert: Shader,
    matcap: Shader,
    normal: Shader,
    phong: Shader,
    physical: Shader,
    points: Shader,
    shadow: Shader,
    sprite: Shader,
    standard: Shader
  ): Dictname = {
    val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], basic = basic.asInstanceOf[js.Any], cube = cube.asInstanceOf[js.Any], dashed = dashed.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], distanceRGBA = distanceRGBA.asInstanceOf[js.Any], equirect = equirect.asInstanceOf[js.Any], lambert = lambert.asInstanceOf[js.Any], matcap = matcap.asInstanceOf[js.Any], normal = normal.asInstanceOf[js.Any], phong = phong.asInstanceOf[js.Any], physical = physical.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any], shadow = shadow.asInstanceOf[js.Any], sprite = sprite.asInstanceOf[js.Any], standard = standard.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dictname]
  }
  @scala.inline
  implicit class DictnameOps[Self <: Dictname] (val x: Self) extends AnyVal {
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
    def setBackground(value: Shader): Self = this.set("background", value.asInstanceOf[js.Any])
    @scala.inline
    def setBasic(value: Shader): Self = this.set("basic", value.asInstanceOf[js.Any])
    @scala.inline
    def setCube(value: Shader): Self = this.set("cube", value.asInstanceOf[js.Any])
    @scala.inline
    def setDashed(value: Shader): Self = this.set("dashed", value.asInstanceOf[js.Any])
    @scala.inline
    def setDepth(value: Shader): Self = this.set("depth", value.asInstanceOf[js.Any])
    @scala.inline
    def setDistanceRGBA(value: Shader): Self = this.set("distanceRGBA", value.asInstanceOf[js.Any])
    @scala.inline
    def setEquirect(value: Shader): Self = this.set("equirect", value.asInstanceOf[js.Any])
    @scala.inline
    def setLambert(value: Shader): Self = this.set("lambert", value.asInstanceOf[js.Any])
    @scala.inline
    def setMatcap(value: Shader): Self = this.set("matcap", value.asInstanceOf[js.Any])
    @scala.inline
    def setNormal(value: Shader): Self = this.set("normal", value.asInstanceOf[js.Any])
    @scala.inline
    def setPhong(value: Shader): Self = this.set("phong", value.asInstanceOf[js.Any])
    @scala.inline
    def setPhysical(value: Shader): Self = this.set("physical", value.asInstanceOf[js.Any])
    @scala.inline
    def setPoints(value: Shader): Self = this.set("points", value.asInstanceOf[js.Any])
    @scala.inline
    def setShadow(value: Shader): Self = this.set("shadow", value.asInstanceOf[js.Any])
    @scala.inline
    def setSprite(value: Shader): Self = this.set("sprite", value.asInstanceOf[js.Any])
    @scala.inline
    def setStandard(value: Shader): Self = this.set("standard", value.asInstanceOf[js.Any])
  }
  
}

