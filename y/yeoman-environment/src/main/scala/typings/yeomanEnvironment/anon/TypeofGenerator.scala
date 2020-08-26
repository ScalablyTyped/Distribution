package typings.yeomanEnvironment.anon

import org.scalablytyped.runtime.Instantiable3
import typings.yeomanGenerator.mod.MemFsEditor
import typings.yeomanGenerator.mod.Storage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofGenerator extends js.Object {
  var Storage: Instantiable3[
    /* name */ String, 
    /* fs */ MemFsEditor, 
    /* configPath */ String, 
    typings.yeomanGenerator.mod.Storage
  ] = js.native
}

object TypeofGenerator {
  @scala.inline
  def apply(Storage: Instantiable3[/* name */ String, /* fs */ MemFsEditor, /* configPath */ String, Storage]): TypeofGenerator = {
    val __obj = js.Dynamic.literal(Storage = Storage.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofGenerator]
  }
  @scala.inline
  implicit class TypeofGeneratorOps[Self <: TypeofGenerator] (val x: Self) extends AnyVal {
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
    def setStorage(value: Instantiable3[/* name */ String, /* fs */ MemFsEditor, /* configPath */ String, Storage]): Self = this.set("Storage", value.asInstanceOf[js.Any])
  }
  
}

