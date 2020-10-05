package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SourceMapSource extends js.Object {
  var fileName: java.lang.String = js.native
  var skipTrivia: js.UndefOr[js.Function1[/* pos */ Double, Double]] = js.native
  var text: java.lang.String = js.native
  def getLineAndCharacterOfPosition(pos: Double): LineAndCharacter = js.native
}

object SourceMapSource {
  @scala.inline
  def apply(
    fileName: java.lang.String,
    getLineAndCharacterOfPosition: Double => LineAndCharacter,
    text: java.lang.String
  ): SourceMapSource = {
    val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any], getLineAndCharacterOfPosition = js.Any.fromFunction1(getLineAndCharacterOfPosition), text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceMapSource]
  }
  @scala.inline
  implicit class SourceMapSourceOps[Self <: SourceMapSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFileName(value: java.lang.String): Self = this.set("fileName", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetLineAndCharacterOfPosition(value: Double => LineAndCharacter): Self = this.set("getLineAndCharacterOfPosition", js.Any.fromFunction1(value))
    @scala.inline
    def setText(value: java.lang.String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def setSkipTrivia(value: /* pos */ Double => Double): Self = this.set("skipTrivia", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSkipTrivia: Self = this.set("skipTrivia", js.undefined)
  }
  
}

