package typings.tsMockito.methodStubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MethodStub extends js.Object {
  
  def execute(args: js.Array[_]): Unit = js.native
  
  def getGroupIndex(): Double = js.native
  
  def getValue(): js.Any = js.native
  
  def isApplicable(args: js.Array[_]): Boolean = js.native
}
object MethodStub {
  
  @scala.inline
  def apply(
    execute: js.Array[_] => Unit,
    getGroupIndex: () => Double,
    getValue: () => js.Any,
    isApplicable: js.Array[_] => Boolean
  ): MethodStub = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getGroupIndex = js.Any.fromFunction0(getGroupIndex), getValue = js.Any.fromFunction0(getValue), isApplicable = js.Any.fromFunction1(isApplicable))
    __obj.asInstanceOf[MethodStub]
  }
  
  @scala.inline
  implicit class MethodStubOps[Self <: MethodStub] (val x: Self) extends AnyVal {
    
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
    def setExecute(value: js.Array[_] => Unit): Self = this.set("execute", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetGroupIndex(value: () => Double): Self = this.set("getGroupIndex", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetValue(value: () => js.Any): Self = this.set("getValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsApplicable(value: js.Array[_] => Boolean): Self = this.set("isApplicable", js.Any.fromFunction1(value))
  }
}
