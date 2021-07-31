package typings.wordpressBlockEditor.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofrawShortcut extends StObject {
  
  def access(character: String): String
  
  def alt(character: String): String
  
  def ctrl(character: String): String
  
  def ctrlShift(character: String): String
  
  def primary(character: String): String
  
  def primaryAlt(character: String): String
  
  def primaryShift(character: String): String
  
  def secondary(character: String): String
  
  def shift(character: String): String
  
  def shiftAlt(character: String): String
}
object TypeofrawShortcut {
  
  @scala.inline
  def apply(
    access: String => String,
    alt: String => String,
    ctrl: String => String,
    ctrlShift: String => String,
    primary: String => String,
    primaryAlt: String => String,
    primaryShift: String => String,
    secondary: String => String,
    shift: String => String,
    shiftAlt: String => String
  ): TypeofrawShortcut = {
    val __obj = js.Dynamic.literal(access = js.Any.fromFunction1(access), alt = js.Any.fromFunction1(alt), ctrl = js.Any.fromFunction1(ctrl), ctrlShift = js.Any.fromFunction1(ctrlShift), primary = js.Any.fromFunction1(primary), primaryAlt = js.Any.fromFunction1(primaryAlt), primaryShift = js.Any.fromFunction1(primaryShift), secondary = js.Any.fromFunction1(secondary), shift = js.Any.fromFunction1(shift), shiftAlt = js.Any.fromFunction1(shiftAlt))
    __obj.asInstanceOf[TypeofrawShortcut]
  }
  
  @scala.inline
  implicit class TypeofrawShortcutMutableBuilder[Self <: TypeofrawShortcut] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccess(value: String => String): Self = StObject.set(x, "access", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAlt(value: String => String): Self = StObject.set(x, "alt", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCtrl(value: String => String): Self = StObject.set(x, "ctrl", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCtrlShift(value: String => String): Self = StObject.set(x, "ctrlShift", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPrimary(value: String => String): Self = StObject.set(x, "primary", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPrimaryAlt(value: String => String): Self = StObject.set(x, "primaryAlt", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPrimaryShift(value: String => String): Self = StObject.set(x, "primaryShift", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSecondary(value: String => String): Self = StObject.set(x, "secondary", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShift(value: String => String): Self = StObject.set(x, "shift", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShiftAlt(value: String => String): Self = StObject.set(x, "shiftAlt", js.Any.fromFunction1(value))
  }
}
