package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuilderProgramHost extends js.Object {
  /**
    * If provided this would be used this hash instead of actual file shape text for detecting changes
    */
  var createHash: js.UndefOr[js.Function1[/* data */ java.lang.String, java.lang.String]] = js.undefined
  /**
    * When emit or emitNextAffectedFile are called without writeFile,
    * this callback if present would be used to write files
    */
  var writeFile: js.UndefOr[WriteFileCallback] = js.undefined
  /**
    * return true if file names are treated with case sensitivity
    */
  def useCaseSensitiveFileNames(): Boolean
}

object BuilderProgramHost {
  @scala.inline
  def apply(
    useCaseSensitiveFileNames: () => Boolean,
    createHash: /* data */ java.lang.String => java.lang.String = null,
    writeFile: (/* fileName */ java.lang.String, /* data */ java.lang.String, /* writeByteOrderMark */ Boolean, /* onError */ js.UndefOr[js.Function1[/* message */ java.lang.String, Unit]], /* sourceFiles */ js.UndefOr[js.Array[SourceFile]]) => Unit = null
  ): BuilderProgramHost = {
    val __obj = js.Dynamic.literal(useCaseSensitiveFileNames = js.Any.fromFunction0(useCaseSensitiveFileNames))
    if (createHash != null) __obj.updateDynamic("createHash")(js.Any.fromFunction1(createHash))
    if (writeFile != null) __obj.updateDynamic("writeFile")(js.Any.fromFunction5(writeFile))
    __obj.asInstanceOf[BuilderProgramHost]
  }
}

