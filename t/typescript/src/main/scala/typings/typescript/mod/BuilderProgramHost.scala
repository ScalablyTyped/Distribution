package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BuilderProgramHost extends js.Object {
  /**
    * If provided this would be used this hash instead of actual file shape text for detecting changes
    */
  var createHash: js.UndefOr[js.Function1[/* data */ java.lang.String, java.lang.String]] = js.native
  /**
    * When emit or emitNextAffectedFile are called without writeFile,
    * this callback if present would be used to write files
    */
  var writeFile: js.UndefOr[WriteFileCallback] = js.native
  /**
    * return true if file names are treated with case sensitivity
    */
  def useCaseSensitiveFileNames(): Boolean = js.native
}

object BuilderProgramHost {
  @scala.inline
  def apply(useCaseSensitiveFileNames: () => Boolean): BuilderProgramHost = {
    val __obj = js.Dynamic.literal(useCaseSensitiveFileNames = js.Any.fromFunction0(useCaseSensitiveFileNames))
    __obj.asInstanceOf[BuilderProgramHost]
  }
  @scala.inline
  implicit class BuilderProgramHostOps[Self <: BuilderProgramHost] (val x: Self) extends AnyVal {
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
    def setUseCaseSensitiveFileNames(value: () => Boolean): Self = this.set("useCaseSensitiveFileNames", js.Any.fromFunction0(value))
    @scala.inline
    def setCreateHash(value: /* data */ java.lang.String => java.lang.String): Self = this.set("createHash", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCreateHash: Self = this.set("createHash", js.undefined)
    @scala.inline
    def setWriteFile(
      value: (/* fileName */ java.lang.String, /* data */ java.lang.String, /* writeByteOrderMark */ Boolean, /* onError */ js.UndefOr[js.Function1[/* message */ java.lang.String, Unit]], /* sourceFiles */ js.UndefOr[js.Array[SourceFile]]) => Unit
    ): Self = this.set("writeFile", js.Any.fromFunction5(value))
    @scala.inline
    def deleteWriteFile: Self = this.set("writeFile", js.undefined)
  }
  
}

