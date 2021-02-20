package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Syntax {
  
  @js.native
  trait EmptySyntaxList extends ISyntaxList {
    
    def findTokenInternal(parent: PositionedElement, position: Double, fullStart: Double): PositionedToken = js.native
    
    def toJSON(key: js.Any): js.Any = js.native
  }
  object EmptySyntaxList {
    
    @scala.inline
    def apply(
      childAt: Double => ISyntaxElement,
      childCount: () => Double,
      collectTextElements: js.Array[String] => Unit,
      findTokenInternal: (PositionedElement, Double, Double) => PositionedToken,
      firstToken: () => ISyntaxToken,
      fullText: () => String,
      fullWidth: () => Double,
      insertChildrenInto: (js.Array[ISyntaxElement], Double) => Unit,
      isIncrementallyUnusable: () => Boolean,
      isList: () => Boolean,
      isNode: () => Boolean,
      isSeparatedList: () => Boolean,
      isToken: () => Boolean,
      isTypeScriptSpecific: () => Boolean,
      kind: () => SyntaxKind,
      lastToken: () => ISyntaxToken,
      leadingTrivia: () => ISyntaxTriviaList,
      leadingTriviaWidth: () => Double,
      toArray: () => js.Array[ISyntaxNodeOrToken],
      toJSON: js.Any => js.Any,
      trailingTrivia: () => ISyntaxTriviaList,
      trailingTriviaWidth: () => Double,
      width: () => Double
    ): EmptySyntaxList = {
      val __obj = js.Dynamic.literal(childAt = js.Any.fromFunction1(childAt), childCount = js.Any.fromFunction0(childCount), collectTextElements = js.Any.fromFunction1(collectTextElements), findTokenInternal = js.Any.fromFunction3(findTokenInternal), firstToken = js.Any.fromFunction0(firstToken), fullText = js.Any.fromFunction0(fullText), fullWidth = js.Any.fromFunction0(fullWidth), insertChildrenInto = js.Any.fromFunction2(insertChildrenInto), isIncrementallyUnusable = js.Any.fromFunction0(isIncrementallyUnusable), isList = js.Any.fromFunction0(isList), isNode = js.Any.fromFunction0(isNode), isSeparatedList = js.Any.fromFunction0(isSeparatedList), isToken = js.Any.fromFunction0(isToken), isTypeScriptSpecific = js.Any.fromFunction0(isTypeScriptSpecific), kind = js.Any.fromFunction0(kind), lastToken = js.Any.fromFunction0(lastToken), leadingTrivia = js.Any.fromFunction0(leadingTrivia), leadingTriviaWidth = js.Any.fromFunction0(leadingTriviaWidth), toArray = js.Any.fromFunction0(toArray), toJSON = js.Any.fromFunction1(toJSON), trailingTrivia = js.Any.fromFunction0(trailingTrivia), trailingTriviaWidth = js.Any.fromFunction0(trailingTriviaWidth), width = js.Any.fromFunction0(width))
      __obj.asInstanceOf[EmptySyntaxList]
    }
    
    @scala.inline
    implicit class EmptySyntaxListMutableBuilder[Self <: EmptySyntaxList] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFindTokenInternal(value: (PositionedElement, Double, Double) => PositionedToken): Self = StObject.set(x, "findTokenInternal", js.Any.fromFunction3(value))
      
      @scala.inline
      def setToJSON(value: js.Any => js.Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait FixedWidthTokenWithLeadingAndTrailingTrivia extends ISyntaxToken {
    
    var _fullText: js.Any = js.native
    
    var _leadingTriviaInfo: js.Any = js.native
    
    var _trailingTriviaInfo: js.Any = js.native
    
    /* private */ def findTokenInternal(parent: js.Any, position: js.Any, fullStart: js.Any): js.Any = js.native
    
    /* private */ def realize(): js.Any = js.native
    
    def toJSON(key: js.Any): js.Any = js.native
  }
  object FixedWidthTokenWithLeadingAndTrailingTrivia {
    
    @scala.inline
    def apply(
      _fullText: js.Any,
      _leadingTriviaInfo: js.Any,
      _trailingTriviaInfo: js.Any,
      accept: ISyntaxVisitor => js.Any,
      childAt: Double => ISyntaxElement,
      childCount: () => Double,
      collectTextElements: js.Array[String] => Unit,
      findTokenInternal: (js.Any, js.Any, js.Any) => js.Any,
      firstToken: () => ISyntaxToken,
      fullText: () => String,
      fullWidth: () => Double,
      hasLeadingComment: () => Boolean,
      hasLeadingNewLine: () => Boolean,
      hasLeadingSkippedText: () => Boolean,
      hasLeadingTrivia: () => Boolean,
      hasSkippedToken: () => Boolean,
      hasTrailingComment: () => Boolean,
      hasTrailingNewLine: () => Boolean,
      hasTrailingSkippedText: () => Boolean,
      hasTrailingTrivia: () => Boolean,
      isExpression: () => Boolean,
      isIncrementallyUnusable: () => Boolean,
      isList: () => Boolean,
      isMemberExpression: () => Boolean,
      isNode: () => Boolean,
      isPostfixExpression: () => Boolean,
      isPrimaryExpression: () => Boolean,
      isSeparatedList: () => Boolean,
      isToken: () => Boolean,
      isTypeScriptSpecific: () => Boolean,
      isUnaryExpression: () => Boolean,
      kind: () => SyntaxKind,
      lastToken: () => ISyntaxToken,
      leadingTrivia: () => ISyntaxTriviaList,
      leadingTriviaWidth: () => Double,
      realize: () => js.Any,
      text: () => String,
      toJSON: js.Any => js.Any,
      tokenKind: SyntaxKind,
      trailingTrivia: () => ISyntaxTriviaList,
      trailingTriviaWidth: () => Double,
      value: () => js.Any,
      valueText: () => String,
      width: () => Double,
      withLeadingTrivia: ISyntaxTriviaList => ISyntaxNodeOrToken,
      withTrailingTrivia: ISyntaxTriviaList => ISyntaxNodeOrToken
    ): FixedWidthTokenWithLeadingAndTrailingTrivia = {
      val __obj = js.Dynamic.literal(_fullText = _fullText.asInstanceOf[js.Any], _leadingTriviaInfo = _leadingTriviaInfo.asInstanceOf[js.Any], _trailingTriviaInfo = _trailingTriviaInfo.asInstanceOf[js.Any], accept = js.Any.fromFunction1(accept), childAt = js.Any.fromFunction1(childAt), childCount = js.Any.fromFunction0(childCount), collectTextElements = js.Any.fromFunction1(collectTextElements), findTokenInternal = js.Any.fromFunction3(findTokenInternal), firstToken = js.Any.fromFunction0(firstToken), fullText = js.Any.fromFunction0(fullText), fullWidth = js.Any.fromFunction0(fullWidth), hasLeadingComment = js.Any.fromFunction0(hasLeadingComment), hasLeadingNewLine = js.Any.fromFunction0(hasLeadingNewLine), hasLeadingSkippedText = js.Any.fromFunction0(hasLeadingSkippedText), hasLeadingTrivia = js.Any.fromFunction0(hasLeadingTrivia), hasSkippedToken = js.Any.fromFunction0(hasSkippedToken), hasTrailingComment = js.Any.fromFunction0(hasTrailingComment), hasTrailingNewLine = js.Any.fromFunction0(hasTrailingNewLine), hasTrailingSkippedText = js.Any.fromFunction0(hasTrailingSkippedText), hasTrailingTrivia = js.Any.fromFunction0(hasTrailingTrivia), isExpression = js.Any.fromFunction0(isExpression), isIncrementallyUnusable = js.Any.fromFunction0(isIncrementallyUnusable), isList = js.Any.fromFunction0(isList), isMemberExpression = js.Any.fromFunction0(isMemberExpression), isNode = js.Any.fromFunction0(isNode), isPostfixExpression = js.Any.fromFunction0(isPostfixExpression), isPrimaryExpression = js.Any.fromFunction0(isPrimaryExpression), isSeparatedList = js.Any.fromFunction0(isSeparatedList), isToken = js.Any.fromFunction0(isToken), isTypeScriptSpecific = js.Any.fromFunction0(isTypeScriptSpecific), isUnaryExpression = js.Any.fromFunction0(isUnaryExpression), kind = js.Any.fromFunction0(kind), lastToken = js.Any.fromFunction0(lastToken), leadingTrivia = js.Any.fromFunction0(leadingTrivia), leadingTriviaWidth = js.Any.fromFunction0(leadingTriviaWidth), realize = js.Any.fromFunction0(realize), text = js.Any.fromFunction0(text), toJSON = js.Any.fromFunction1(toJSON), tokenKind = tokenKind.asInstanceOf[js.Any], trailingTrivia = js.Any.fromFunction0(trailingTrivia), trailingTriviaWidth = js.Any.fromFunction0(trailingTriviaWidth), value = js.Any.fromFunction0(value), valueText = js.Any.fromFunction0(valueText), width = js.Any.fromFunction0(width), withLeadingTrivia = js.Any.fromFunction1(withLeadingTrivia), withTrailingTrivia = js.Any.fromFunction1(withTrailingTrivia))
      __obj.asInstanceOf[FixedWidthTokenWithLeadingAndTrailingTrivia]
    }
    
    @scala.inline
    implicit class FixedWidthTokenWithLeadingAndTrailingTriviaMutableBuilder[Self <: FixedWidthTokenWithLeadingAndTrailingTrivia] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFindTokenInternal(value: (js.Any, js.Any, js.Any) => js.Any): Self = StObject.set(x, "findTokenInternal", js.Any.fromFunction3(value))
      
      @scala.inline
      def setRealize(value: () => js.Any): Self = StObject.set(x, "realize", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToJSON(value: js.Any => js.Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction1(value))
      
      @scala.inline
      def set_fullText(value: js.Any): Self = StObject.set(x, "_fullText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_leadingTriviaInfo(value: js.Any): Self = StObject.set(x, "_leadingTriviaInfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_trailingTriviaInfo(value: js.Any): Self = StObject.set(x, "_trailingTriviaInfo", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FixedWidthTokenWithLeadingTrivia extends ISyntaxToken {
    
    var _fullText: js.Any = js.native
    
    var _leadingTriviaInfo: js.Any = js.native
    
    /* private */ def findTokenInternal(parent: js.Any, position: js.Any, fullStart: js.Any): js.Any = js.native
    
    /* private */ def realize(): js.Any = js.native
    
    def toJSON(key: js.Any): js.Any = js.native
  }
  object FixedWidthTokenWithLeadingTrivia {
    
    @scala.inline
    def apply(
      _fullText: js.Any,
      _leadingTriviaInfo: js.Any,
      accept: ISyntaxVisitor => js.Any,
      childAt: Double => ISyntaxElement,
      childCount: () => Double,
      collectTextElements: js.Array[String] => Unit,
      findTokenInternal: (js.Any, js.Any, js.Any) => js.Any,
      firstToken: () => ISyntaxToken,
      fullText: () => String,
      fullWidth: () => Double,
      hasLeadingComment: () => Boolean,
      hasLeadingNewLine: () => Boolean,
      hasLeadingSkippedText: () => Boolean,
      hasLeadingTrivia: () => Boolean,
      hasSkippedToken: () => Boolean,
      hasTrailingComment: () => Boolean,
      hasTrailingNewLine: () => Boolean,
      hasTrailingSkippedText: () => Boolean,
      hasTrailingTrivia: () => Boolean,
      isExpression: () => Boolean,
      isIncrementallyUnusable: () => Boolean,
      isList: () => Boolean,
      isMemberExpression: () => Boolean,
      isNode: () => Boolean,
      isPostfixExpression: () => Boolean,
      isPrimaryExpression: () => Boolean,
      isSeparatedList: () => Boolean,
      isToken: () => Boolean,
      isTypeScriptSpecific: () => Boolean,
      isUnaryExpression: () => Boolean,
      kind: () => SyntaxKind,
      lastToken: () => ISyntaxToken,
      leadingTrivia: () => ISyntaxTriviaList,
      leadingTriviaWidth: () => Double,
      realize: () => js.Any,
      text: () => String,
      toJSON: js.Any => js.Any,
      tokenKind: SyntaxKind,
      trailingTrivia: () => ISyntaxTriviaList,
      trailingTriviaWidth: () => Double,
      value: () => js.Any,
      valueText: () => String,
      width: () => Double,
      withLeadingTrivia: ISyntaxTriviaList => ISyntaxNodeOrToken,
      withTrailingTrivia: ISyntaxTriviaList => ISyntaxNodeOrToken
    ): FixedWidthTokenWithLeadingTrivia = {
      val __obj = js.Dynamic.literal(_fullText = _fullText.asInstanceOf[js.Any], _leadingTriviaInfo = _leadingTriviaInfo.asInstanceOf[js.Any], accept = js.Any.fromFunction1(accept), childAt = js.Any.fromFunction1(childAt), childCount = js.Any.fromFunction0(childCount), collectTextElements = js.Any.fromFunction1(collectTextElements), findTokenInternal = js.Any.fromFunction3(findTokenInternal), firstToken = js.Any.fromFunction0(firstToken), fullText = js.Any.fromFunction0(fullText), fullWidth = js.Any.fromFunction0(fullWidth), hasLeadingComment = js.Any.fromFunction0(hasLeadingComment), hasLeadingNewLine = js.Any.fromFunction0(hasLeadingNewLine), hasLeadingSkippedText = js.Any.fromFunction0(hasLeadingSkippedText), hasLeadingTrivia = js.Any.fromFunction0(hasLeadingTrivia), hasSkippedToken = js.Any.fromFunction0(hasSkippedToken), hasTrailingComment = js.Any.fromFunction0(hasTrailingComment), hasTrailingNewLine = js.Any.fromFunction0(hasTrailingNewLine), hasTrailingSkippedText = js.Any.fromFunction0(hasTrailingSkippedText), hasTrailingTrivia = js.Any.fromFunction0(hasTrailingTrivia), isExpression = js.Any.fromFunction0(isExpression), isIncrementallyUnusable = js.Any.fromFunction0(isIncrementallyUnusable), isList = js.Any.fromFunction0(isList), isMemberExpression = js.Any.fromFunction0(isMemberExpression), isNode = js.Any.fromFunction0(isNode), isPostfixExpression = js.Any.fromFunction0(isPostfixExpression), isPrimaryExpression = js.Any.fromFunction0(isPrimaryExpression), isSeparatedList = js.Any.fromFunction0(isSeparatedList), isToken = js.Any.fromFunction0(isToken), isTypeScriptSpecific = js.Any.fromFunction0(isTypeScriptSpecific), isUnaryExpression = js.Any.fromFunction0(isUnaryExpression), kind = js.Any.fromFunction0(kind), lastToken = js.Any.fromFunction0(lastToken), leadingTrivia = js.Any.fromFunction0(leadingTrivia), leadingTriviaWidth = js.Any.fromFunction0(leadingTriviaWidth), realize = js.Any.fromFunction0(realize), text = js.Any.fromFunction0(text), toJSON = js.Any.fromFunction1(toJSON), tokenKind = tokenKind.asInstanceOf[js.Any], trailingTrivia = js.Any.fromFunction0(trailingTrivia), trailingTriviaWidth = js.Any.fromFunction0(trailingTriviaWidth), value = js.Any.fromFunction0(value), valueText = js.Any.fromFunction0(valueText), width = js.Any.fromFunction0(width), withLeadingTrivia = js.Any.fromFunction1(withLeadingTrivia), withTrailingTrivia = js.Any.fromFunction1(withTrailingTrivia))
      __obj.asInstanceOf[FixedWidthTokenWithLeadingTrivia]
    }
    
    @scala.inline
    implicit class FixedWidthTokenWithLeadingTriviaMutableBuilder[Self <: FixedWidthTokenWithLeadingTrivia] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFindTokenInternal(value: (js.Any, js.Any, js.Any) => js.Any): Self = StObject.set(x, "findTokenInternal", js.Any.fromFunction3(value))
      
      @scala.inline
      def setRealize(value: () => js.Any): Self = StObject.set(x, "realize", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToJSON(value: js.Any => js.Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction1(value))
      
      @scala.inline
      def set_fullText(value: js.Any): Self = StObject.set(x, "_fullText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_leadingTriviaInfo(value: js.Any): Self = StObject.set(x, "_leadingTriviaInfo", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FixedWidthTokenWithNoTrivia extends ISyntaxToken {
    
    /* private */ def findTokenInternal(parent: js.Any, position: js.Any, fullStart: js.Any): js.Any = js.native
    
    /* private */ def realize(): js.Any = js.native
    
    def toJSON(key: js.Any): js.Any = js.native
  }
  object FixedWidthTokenWithNoTrivia {
    
    @scala.inline
    def apply(
      accept: ISyntaxVisitor => js.Any,
      childAt: Double => ISyntaxElement,
      childCount: () => Double,
      collectTextElements: js.Array[String] => Unit,
      findTokenInternal: (js.Any, js.Any, js.Any) => js.Any,
      firstToken: () => ISyntaxToken,
      fullText: () => String,
      fullWidth: () => Double,
      hasLeadingComment: () => Boolean,
      hasLeadingNewLine: () => Boolean,
      hasLeadingSkippedText: () => Boolean,
      hasLeadingTrivia: () => Boolean,
      hasSkippedToken: () => Boolean,
      hasTrailingComment: () => Boolean,
      hasTrailingNewLine: () => Boolean,
      hasTrailingSkippedText: () => Boolean,
      hasTrailingTrivia: () => Boolean,
      isExpression: () => Boolean,
      isIncrementallyUnusable: () => Boolean,
      isList: () => Boolean,
      isMemberExpression: () => Boolean,
      isNode: () => Boolean,
      isPostfixExpression: () => Boolean,
      isPrimaryExpression: () => Boolean,
      isSeparatedList: () => Boolean,
      isToken: () => Boolean,
      isTypeScriptSpecific: () => Boolean,
      isUnaryExpression: () => Boolean,
      kind: () => SyntaxKind,
      lastToken: () => ISyntaxToken,
      leadingTrivia: () => ISyntaxTriviaList,
      leadingTriviaWidth: () => Double,
      realize: () => js.Any,
      text: () => String,
      toJSON: js.Any => js.Any,
      tokenKind: SyntaxKind,
      trailingTrivia: () => ISyntaxTriviaList,
      trailingTriviaWidth: () => Double,
      value: () => js.Any,
      valueText: () => String,
      width: () => Double,
      withLeadingTrivia: ISyntaxTriviaList => ISyntaxNodeOrToken,
      withTrailingTrivia: ISyntaxTriviaList => ISyntaxNodeOrToken
    ): FixedWidthTokenWithNoTrivia = {
      val __obj = js.Dynamic.literal(accept = js.Any.fromFunction1(accept), childAt = js.Any.fromFunction1(childAt), childCount = js.Any.fromFunction0(childCount), collectTextElements = js.Any.fromFunction1(collectTextElements), findTokenInternal = js.Any.fromFunction3(findTokenInternal), firstToken = js.Any.fromFunction0(firstToken), fullText = js.Any.fromFunction0(fullText), fullWidth = js.Any.fromFunction0(fullWidth), hasLeadingComment = js.Any.fromFunction0(hasLeadingComment), hasLeadingNewLine = js.Any.fromFunction0(hasLeadingNewLine), hasLeadingSkippedText = js.Any.fromFunction0(hasLeadingSkippedText), hasLeadingTrivia = js.Any.fromFunction0(hasLeadingTrivia), hasSkippedToken = js.Any.fromFunction0(hasSkippedToken), hasTrailingComment = js.Any.fromFunction0(hasTrailingComment), hasTrailingNewLine = js.Any.fromFunction0(hasTrailingNewLine), hasTrailingSkippedText = js.Any.fromFunction0(hasTrailingSkippedText), hasTrailingTrivia = js.Any.fromFunction0(hasTrailingTrivia), isExpression = js.Any.fromFunction0(isExpression), isIncrementallyUnusable = js.Any.fromFunction0(isIncrementallyUnusable), isList = js.Any.fromFunction0(isList), isMemberExpression = js.Any.fromFunction0(isMemberExpression), isNode = js.Any.fromFunction0(isNode), isPostfixExpression = js.Any.fromFunction0(isPostfixExpression), isPrimaryExpression = js.Any.fromFunction0(isPrimaryExpression), isSeparatedList = js.Any.fromFunction0(isSeparatedList), isToken = js.Any.fromFunction0(isToken), isTypeScriptSpecific = js.Any.fromFunction0(isTypeScriptSpecific), isUnaryExpression = js.Any.fromFunction0(isUnaryExpression), kind = js.Any.fromFunction0(kind), lastToken = js.Any.fromFunction0(lastToken), leadingTrivia = js.Any.fromFunction0(leadingTrivia), leadingTriviaWidth = js.Any.fromFunction0(leadingTriviaWidth), realize = js.Any.fromFunction0(realize), text = js.Any.fromFunction0(text), toJSON = js.Any.fromFunction1(toJSON), tokenKind = tokenKind.asInstanceOf[js.Any], trailingTrivia = js.Any.fromFunction0(trailingTrivia), trailingTriviaWidth = js.Any.fromFunction0(trailingTriviaWidth), value = js.Any.fromFunction0(value), valueText = js.Any.fromFunction0(valueText), width = js.Any.fromFunction0(width), withLeadingTrivia = js.Any.fromFunction1(withLeadingTrivia), withTrailingTrivia = js.Any.fromFunction1(withTrailingTrivia))
      __obj.asInstanceOf[FixedWidthTokenWithNoTrivia]
    }
    
    @scala.inline
    implicit class FixedWidthTokenWithNoTriviaMutableBuilder[Self <: FixedWidthTokenWithNoTrivia] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFindTokenInternal(value: (js.Any, js.Any, js.Any) => js.Any): Self = StObject.set(x, "findTokenInternal", js.Any.fromFunction3(value))
      
      @scala.inline
      def setRealize(value: () => js.Any): Self = StObject.set(x, "realize", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToJSON(value: js.Any => js.Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait FixedWidthTokenWithTrailingTrivia extends ISyntaxToken {
    
    var _fullText: js.Any = js.native
    
    var _trailingTriviaInfo: js.Any = js.native
    
    /* private */ def findTokenInternal(parent: js.Any, position: js.Any, fullStart: js.Any): js.Any = js.native
    
    /* private */ def realize(): js.Any = js.native
    
    def toJSON(key: js.Any): js.Any = js.native
  }
  object FixedWidthTokenWithTrailingTrivia {
    
    @scala.inline
    def apply(
      _fullText: js.Any,
      _trailingTriviaInfo: js.Any,
      accept: ISyntaxVisitor => js.Any,
      childAt: Double => ISyntaxElement,
      childCount: () => Double,
      collectTextElements: js.Array[String] => Unit,
      findTokenInternal: (js.Any, js.Any, js.Any) => js.Any,
      firstToken: () => ISyntaxToken,
      fullText: () => String,
      fullWidth: () => Double,
      hasLeadingComment: () => Boolean,
      hasLeadingNewLine: () => Boolean,
      hasLeadingSkippedText: () => Boolean,
      hasLeadingTrivia: () => Boolean,
      hasSkippedToken: () => Boolean,
      hasTrailingComment: () => Boolean,
      hasTrailingNewLine: () => Boolean,
      hasTrailingSkippedText: () => Boolean,
      hasTrailingTrivia: () => Boolean,
      isExpression: () => Boolean,
      isIncrementallyUnusable: () => Boolean,
      isList: () => Boolean,
      isMemberExpression: () => Boolean,
      isNode: () => Boolean,
      isPostfixExpression: () => Boolean,
      isPrimaryExpression: () => Boolean,
      isSeparatedList: () => Boolean,
      isToken: () => Boolean,
      isTypeScriptSpecific: () => Boolean,
      isUnaryExpression: () => Boolean,
      kind: () => SyntaxKind,
      lastToken: () => ISyntaxToken,
      leadingTrivia: () => ISyntaxTriviaList,
      leadingTriviaWidth: () => Double,
      realize: () => js.Any,
      text: () => String,
      toJSON: js.Any => js.Any,
      tokenKind: SyntaxKind,
      trailingTrivia: () => ISyntaxTriviaList,
      trailingTriviaWidth: () => Double,
      value: () => js.Any,
      valueText: () => String,
      width: () => Double,
      withLeadingTrivia: ISyntaxTriviaList => ISyntaxNodeOrToken,
      withTrailingTrivia: ISyntaxTriviaList => ISyntaxNodeOrToken
    ): FixedWidthTokenWithTrailingTrivia = {
      val __obj = js.Dynamic.literal(_fullText = _fullText.asInstanceOf[js.Any], _trailingTriviaInfo = _trailingTriviaInfo.asInstanceOf[js.Any], accept = js.Any.fromFunction1(accept), childAt = js.Any.fromFunction1(childAt), childCount = js.Any.fromFunction0(childCount), collectTextElements = js.Any.fromFunction1(collectTextElements), findTokenInternal = js.Any.fromFunction3(findTokenInternal), firstToken = js.Any.fromFunction0(firstToken), fullText = js.Any.fromFunction0(fullText), fullWidth = js.Any.fromFunction0(fullWidth), hasLeadingComment = js.Any.fromFunction0(hasLeadingComment), hasLeadingNewLine = js.Any.fromFunction0(hasLeadingNewLine), hasLeadingSkippedText = js.Any.fromFunction0(hasLeadingSkippedText), hasLeadingTrivia = js.Any.fromFunction0(hasLeadingTrivia), hasSkippedToken = js.Any.fromFunction0(hasSkippedToken), hasTrailingComment = js.Any.fromFunction0(hasTrailingComment), hasTrailingNewLine = js.Any.fromFunction0(hasTrailingNewLine), hasTrailingSkippedText = js.Any.fromFunction0(hasTrailingSkippedText), hasTrailingTrivia = js.Any.fromFunction0(hasTrailingTrivia), isExpression = js.Any.fromFunction0(isExpression), isIncrementallyUnusable = js.Any.fromFunction0(isIncrementallyUnusable), isList = js.Any.fromFunction0(isList), isMemberExpression = js.Any.fromFunction0(isMemberExpression), isNode = js.Any.fromFunction0(isNode), isPostfixExpression = js.Any.fromFunction0(isPostfixExpression), isPrimaryExpression = js.Any.fromFunction0(isPrimaryExpression), isSeparatedList = js.Any.fromFunction0(isSeparatedList), isToken = js.Any.fromFunction0(isToken), isTypeScriptSpecific = js.Any.fromFunction0(isTypeScriptSpecific), isUnaryExpression = js.Any.fromFunction0(isUnaryExpression), kind = js.Any.fromFunction0(kind), lastToken = js.Any.fromFunction0(lastToken), leadingTrivia = js.Any.fromFunction0(leadingTrivia), leadingTriviaWidth = js.Any.fromFunction0(leadingTriviaWidth), realize = js.Any.fromFunction0(realize), text = js.Any.fromFunction0(text), toJSON = js.Any.fromFunction1(toJSON), tokenKind = tokenKind.asInstanceOf[js.Any], trailingTrivia = js.Any.fromFunction0(trailingTrivia), trailingTriviaWidth = js.Any.fromFunction0(trailingTriviaWidth), value = js.Any.fromFunction0(value), valueText = js.Any.fromFunction0(valueText), width = js.Any.fromFunction0(width), withLeadingTrivia = js.Any.fromFunction1(withLeadingTrivia), withTrailingTrivia = js.Any.fromFunction1(withTrailingTrivia))
      __obj.asInstanceOf[FixedWidthTokenWithTrailingTrivia]
    }
    
    @scala.inline
    implicit class FixedWidthTokenWithTrailingTriviaMutableBuilder[Self <: FixedWidthTokenWithTrailingTrivia] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFindTokenInternal(value: (js.Any, js.Any, js.Any) => js.Any): Self = StObject.set(x, "findTokenInternal", js.Any.fromFunction3(value))
      
      @scala.inline
      def setRealize(value: () => js.Any): Self = StObject.set(x, "realize", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToJSON(value: js.Any => js.Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction1(value))
      
      @scala.inline
      def set_fullText(value: js.Any): Self = StObject.set(x, "_fullText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_trailingTriviaInfo(value: js.Any): Self = StObject.set(x, "_trailingTriviaInfo", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IFactory extends StObject {
    
    def argumentList(
      typeArgumentList: TypeArgumentListSyntax,
      openParenToken: ISyntaxToken,
      arguments: ISeparatedSyntaxList,
      closeParenToken: ISyntaxToken
    ): ArgumentListSyntax = js.native
    
    def arrayLiteralExpression(openBracketToken: ISyntaxToken, expressions: ISeparatedSyntaxList, closeBracketToken: ISyntaxToken): ArrayLiteralExpressionSyntax = js.native
    
    def arrayType(`type`: ITypeSyntax, openBracketToken: ISyntaxToken, closeBracketToken: ISyntaxToken): ArrayTypeSyntax = js.native
    
    def binaryExpression(kind: SyntaxKind, left: IExpressionSyntax, operatorToken: ISyntaxToken, right: IExpressionSyntax): BinaryExpressionSyntax = js.native
    
    def block(openBraceToken: ISyntaxToken, statements: ISyntaxList, closeBraceToken: ISyntaxToken): BlockSyntax = js.native
    
    def breakStatement(breakKeyword: ISyntaxToken, identifier: ISyntaxToken, semicolonToken: ISyntaxToken): BreakStatementSyntax = js.native
    
    def callSignature(
      typeParameterList: TypeParameterListSyntax,
      parameterList: ParameterListSyntax,
      typeAnnotation: TypeAnnotationSyntax
    ): CallSignatureSyntax = js.native
    
    def caseSwitchClause(
      caseKeyword: ISyntaxToken,
      expression: IExpressionSyntax,
      colonToken: ISyntaxToken,
      statements: ISyntaxList
    ): CaseSwitchClauseSyntax = js.native
    
    def castExpression(
      lessThanToken: ISyntaxToken,
      `type`: ITypeSyntax,
      greaterThanToken: ISyntaxToken,
      expression: IUnaryExpressionSyntax
    ): CastExpressionSyntax = js.native
    
    def catchClause(
      catchKeyword: ISyntaxToken,
      openParenToken: ISyntaxToken,
      identifier: ISyntaxToken,
      typeAnnotation: TypeAnnotationSyntax,
      closeParenToken: ISyntaxToken,
      block: BlockSyntax
    ): CatchClauseSyntax = js.native
    
    def classDeclaration(
      modifiers: ISyntaxList,
      classKeyword: ISyntaxToken,
      identifier: ISyntaxToken,
      typeParameterList: TypeParameterListSyntax,
      heritageClauses: ISyntaxList,
      openBraceToken: ISyntaxToken,
      classElements: ISyntaxList,
      closeBraceToken: ISyntaxToken
    ): ClassDeclarationSyntax = js.native
    
    def conditionalExpression(
      condition: IExpressionSyntax,
      questionToken: ISyntaxToken,
      whenTrue: IExpressionSyntax,
      colonToken: ISyntaxToken,
      whenFalse: IExpressionSyntax
    ): ConditionalExpressionSyntax = js.native
    
    def constraint(extendsKeyword: ISyntaxToken, `type`: ITypeSyntax): ConstraintSyntax = js.native
    
    def constructSignature(newKeyword: ISyntaxToken, callSignature: CallSignatureSyntax): ConstructSignatureSyntax = js.native
    
    def constructorDeclaration(
      modifiers: ISyntaxList,
      constructorKeyword: ISyntaxToken,
      callSignature: CallSignatureSyntax,
      block: BlockSyntax,
      semicolonToken: ISyntaxToken
    ): ConstructorDeclarationSyntax = js.native
    
    def constructorType(
      newKeyword: ISyntaxToken,
      typeParameterList: TypeParameterListSyntax,
      parameterList: ParameterListSyntax,
      equalsGreaterThanToken: ISyntaxToken,
      `type`: ITypeSyntax
    ): ConstructorTypeSyntax = js.native
    
    def continueStatement(continueKeyword: ISyntaxToken, identifier: ISyntaxToken, semicolonToken: ISyntaxToken): ContinueStatementSyntax = js.native
    
    def debuggerStatement(debuggerKeyword: ISyntaxToken, semicolonToken: ISyntaxToken): DebuggerStatementSyntax = js.native
    
    def defaultSwitchClause(defaultKeyword: ISyntaxToken, colonToken: ISyntaxToken, statements: ISyntaxList): DefaultSwitchClauseSyntax = js.native
    
    def deleteExpression(deleteKeyword: ISyntaxToken, expression: IUnaryExpressionSyntax): DeleteExpressionSyntax = js.native
    
    def doStatement(
      doKeyword: ISyntaxToken,
      statement: IStatementSyntax,
      whileKeyword: ISyntaxToken,
      openParenToken: ISyntaxToken,
      condition: IExpressionSyntax,
      closeParenToken: ISyntaxToken,
      semicolonToken: ISyntaxToken
    ): DoStatementSyntax = js.native
    
    def elementAccessExpression(
      expression: IExpressionSyntax,
      openBracketToken: ISyntaxToken,
      argumentExpression: IExpressionSyntax,
      closeBracketToken: ISyntaxToken
    ): ElementAccessExpressionSyntax = js.native
    
    def elseClause(elseKeyword: ISyntaxToken, statement: IStatementSyntax): ElseClauseSyntax = js.native
    
    def emptyStatement(semicolonToken: ISyntaxToken): EmptyStatementSyntax = js.native
    
    def enumDeclaration(
      modifiers: ISyntaxList,
      enumKeyword: ISyntaxToken,
      identifier: ISyntaxToken,
      openBraceToken: ISyntaxToken,
      enumElements: ISeparatedSyntaxList,
      closeBraceToken: ISyntaxToken
    ): EnumDeclarationSyntax = js.native
    
    def enumElement(propertyName: ISyntaxToken, equalsValueClause: EqualsValueClauseSyntax): EnumElementSyntax = js.native
    
    def equalsValueClause(equalsToken: ISyntaxToken, value: IExpressionSyntax): EqualsValueClauseSyntax = js.native
    
    def exportAssignment(
      exportKeyword: ISyntaxToken,
      equalsToken: ISyntaxToken,
      identifier: ISyntaxToken,
      semicolonToken: ISyntaxToken
    ): ExportAssignmentSyntax = js.native
    
    def expressionStatement(expression: IExpressionSyntax, semicolonToken: ISyntaxToken): ExpressionStatementSyntax = js.native
    
    def externalModuleReference(
      requireKeyword: ISyntaxToken,
      openParenToken: ISyntaxToken,
      stringLiteral: ISyntaxToken,
      closeParenToken: ISyntaxToken
    ): ExternalModuleReferenceSyntax = js.native
    
    def finallyClause(finallyKeyword: ISyntaxToken, block: BlockSyntax): FinallyClauseSyntax = js.native
    
    def forInStatement(
      forKeyword: ISyntaxToken,
      openParenToken: ISyntaxToken,
      variableDeclaration: VariableDeclarationSyntax,
      left: IExpressionSyntax,
      inKeyword: ISyntaxToken,
      expression: IExpressionSyntax,
      closeParenToken: ISyntaxToken,
      statement: IStatementSyntax
    ): ForInStatementSyntax = js.native
    
    def forStatement(
      forKeyword: ISyntaxToken,
      openParenToken: ISyntaxToken,
      variableDeclaration: VariableDeclarationSyntax,
      initializer: IExpressionSyntax,
      firstSemicolonToken: ISyntaxToken,
      condition: IExpressionSyntax,
      secondSemicolonToken: ISyntaxToken,
      incrementor: IExpressionSyntax,
      closeParenToken: ISyntaxToken,
      statement: IStatementSyntax
    ): ForStatementSyntax = js.native
    
    def functionDeclaration(
      modifiers: ISyntaxList,
      functionKeyword: ISyntaxToken,
      identifier: ISyntaxToken,
      callSignature: CallSignatureSyntax,
      block: BlockSyntax,
      semicolonToken: ISyntaxToken
    ): FunctionDeclarationSyntax = js.native
    
    def functionExpression(
      functionKeyword: ISyntaxToken,
      identifier: ISyntaxToken,
      callSignature: CallSignatureSyntax,
      block: BlockSyntax
    ): FunctionExpressionSyntax = js.native
    
    def functionPropertyAssignment(propertyName: ISyntaxToken, callSignature: CallSignatureSyntax, block: BlockSyntax): FunctionPropertyAssignmentSyntax = js.native
    
    def functionType(
      typeParameterList: TypeParameterListSyntax,
      parameterList: ParameterListSyntax,
      equalsGreaterThanToken: ISyntaxToken,
      `type`: ITypeSyntax
    ): FunctionTypeSyntax = js.native
    
    def genericType(name: INameSyntax, typeArgumentList: TypeArgumentListSyntax): GenericTypeSyntax = js.native
    
    def getAccessor(
      modifiers: ISyntaxList,
      getKeyword: ISyntaxToken,
      propertyName: ISyntaxToken,
      parameterList: ParameterListSyntax,
      typeAnnotation: TypeAnnotationSyntax,
      block: BlockSyntax
    ): GetAccessorSyntax = js.native
    
    def heritageClause(kind: SyntaxKind, extendsOrImplementsKeyword: ISyntaxToken, typeNames: ISeparatedSyntaxList): HeritageClauseSyntax = js.native
    
    def ifStatement(
      ifKeyword: ISyntaxToken,
      openParenToken: ISyntaxToken,
      condition: IExpressionSyntax,
      closeParenToken: ISyntaxToken,
      statement: IStatementSyntax,
      elseClause: ElseClauseSyntax
    ): IfStatementSyntax = js.native
    
    def importDeclaration(
      modifiers: ISyntaxList,
      importKeyword: ISyntaxToken,
      identifier: ISyntaxToken,
      equalsToken: ISyntaxToken,
      moduleReference: IModuleReferenceSyntax,
      semicolonToken: ISyntaxToken
    ): ImportDeclarationSyntax = js.native
    
    def indexMemberDeclaration(modifiers: ISyntaxList, indexSignature: IndexSignatureSyntax, semicolonToken: ISyntaxToken): IndexMemberDeclarationSyntax = js.native
    
    def indexSignature(
      openBracketToken: ISyntaxToken,
      parameter: ParameterSyntax,
      closeBracketToken: ISyntaxToken,
      typeAnnotation: TypeAnnotationSyntax
    ): IndexSignatureSyntax = js.native
    
    def interfaceDeclaration(
      modifiers: ISyntaxList,
      interfaceKeyword: ISyntaxToken,
      identifier: ISyntaxToken,
      typeParameterList: TypeParameterListSyntax,
      heritageClauses: ISyntaxList,
      body: ObjectTypeSyntax
    ): InterfaceDeclarationSyntax = js.native
    
    def invocationExpression(expression: IMemberExpressionSyntax, argumentList: ArgumentListSyntax): InvocationExpressionSyntax = js.native
    
    def labeledStatement(identifier: ISyntaxToken, colonToken: ISyntaxToken, statement: IStatementSyntax): LabeledStatementSyntax = js.native
    
    def memberAccessExpression(expression: IExpressionSyntax, dotToken: ISyntaxToken, name: ISyntaxToken): MemberAccessExpressionSyntax = js.native
    
    def memberFunctionDeclaration(
      modifiers: ISyntaxList,
      propertyName: ISyntaxToken,
      callSignature: CallSignatureSyntax,
      block: BlockSyntax,
      semicolonToken: ISyntaxToken
    ): MemberFunctionDeclarationSyntax = js.native
    
    def memberVariableDeclaration(modifiers: ISyntaxList, variableDeclarator: VariableDeclaratorSyntax, semicolonToken: ISyntaxToken): MemberVariableDeclarationSyntax = js.native
    
    def methodSignature(propertyName: ISyntaxToken, questionToken: ISyntaxToken, callSignature: CallSignatureSyntax): MethodSignatureSyntax = js.native
    
    def moduleDeclaration(
      modifiers: ISyntaxList,
      moduleKeyword: ISyntaxToken,
      name: INameSyntax,
      stringLiteral: ISyntaxToken,
      openBraceToken: ISyntaxToken,
      moduleElements: ISyntaxList,
      closeBraceToken: ISyntaxToken
    ): ModuleDeclarationSyntax = js.native
    
    def moduleNameModuleReference(moduleName: INameSyntax): ModuleNameModuleReferenceSyntax = js.native
    
    def objectCreationExpression(newKeyword: ISyntaxToken, expression: IMemberExpressionSyntax, argumentList: ArgumentListSyntax): ObjectCreationExpressionSyntax = js.native
    
    def objectLiteralExpression(
      openBraceToken: ISyntaxToken,
      propertyAssignments: ISeparatedSyntaxList,
      closeBraceToken: ISyntaxToken
    ): ObjectLiteralExpressionSyntax = js.native
    
    def objectType(openBraceToken: ISyntaxToken, typeMembers: ISeparatedSyntaxList, closeBraceToken: ISyntaxToken): ObjectTypeSyntax = js.native
    
    def omittedExpression(): OmittedExpressionSyntax = js.native
    
    def parameter(
      dotDotDotToken: ISyntaxToken,
      modifiers: ISyntaxList,
      identifier: ISyntaxToken,
      questionToken: ISyntaxToken,
      typeAnnotation: TypeAnnotationSyntax,
      equalsValueClause: EqualsValueClauseSyntax
    ): ParameterSyntax = js.native
    
    def parameterList(openParenToken: ISyntaxToken, parameters: ISeparatedSyntaxList, closeParenToken: ISyntaxToken): ParameterListSyntax = js.native
    
    def parenthesizedArrowFunctionExpression(
      callSignature: CallSignatureSyntax,
      equalsGreaterThanToken: ISyntaxToken,
      block: BlockSyntax,
      expression: IExpressionSyntax
    ): ParenthesizedArrowFunctionExpressionSyntax = js.native
    
    def parenthesizedExpression(openParenToken: ISyntaxToken, expression: IExpressionSyntax, closeParenToken: ISyntaxToken): ParenthesizedExpressionSyntax = js.native
    
    def postfixUnaryExpression(kind: SyntaxKind, operand: IMemberExpressionSyntax, operatorToken: ISyntaxToken): PostfixUnaryExpressionSyntax = js.native
    
    def prefixUnaryExpression(kind: SyntaxKind, operatorToken: ISyntaxToken, operand: IUnaryExpressionSyntax): PrefixUnaryExpressionSyntax = js.native
    
    def propertySignature(propertyName: ISyntaxToken, questionToken: ISyntaxToken, typeAnnotation: TypeAnnotationSyntax): PropertySignatureSyntax = js.native
    
    def qualifiedName(left: INameSyntax, dotToken: ISyntaxToken, right: ISyntaxToken): QualifiedNameSyntax = js.native
    
    def returnStatement(returnKeyword: ISyntaxToken, expression: IExpressionSyntax, semicolonToken: ISyntaxToken): ReturnStatementSyntax = js.native
    
    def setAccessor(
      modifiers: ISyntaxList,
      setKeyword: ISyntaxToken,
      propertyName: ISyntaxToken,
      parameterList: ParameterListSyntax,
      block: BlockSyntax
    ): SetAccessorSyntax = js.native
    
    def simpleArrowFunctionExpression(
      identifier: ISyntaxToken,
      equalsGreaterThanToken: ISyntaxToken,
      block: BlockSyntax,
      expression: IExpressionSyntax
    ): SimpleArrowFunctionExpressionSyntax = js.native
    
    def simplePropertyAssignment(propertyName: ISyntaxToken, colonToken: ISyntaxToken, expression: IExpressionSyntax): SimplePropertyAssignmentSyntax = js.native
    
    def sourceUnit(moduleElements: ISyntaxList, endOfFileToken: ISyntaxToken): SourceUnitSyntax = js.native
    
    def switchStatement(
      switchKeyword: ISyntaxToken,
      openParenToken: ISyntaxToken,
      expression: IExpressionSyntax,
      closeParenToken: ISyntaxToken,
      openBraceToken: ISyntaxToken,
      switchClauses: ISyntaxList,
      closeBraceToken: ISyntaxToken
    ): SwitchStatementSyntax = js.native
    
    def throwStatement(throwKeyword: ISyntaxToken, expression: IExpressionSyntax, semicolonToken: ISyntaxToken): ThrowStatementSyntax = js.native
    
    def tryStatement(
      tryKeyword: ISyntaxToken,
      block: BlockSyntax,
      catchClause: CatchClauseSyntax,
      finallyClause: FinallyClauseSyntax
    ): TryStatementSyntax = js.native
    
    def typeAnnotation(colonToken: ISyntaxToken, `type`: ITypeSyntax): TypeAnnotationSyntax = js.native
    
    def typeArgumentList(lessThanToken: ISyntaxToken, typeArguments: ISeparatedSyntaxList, greaterThanToken: ISyntaxToken): TypeArgumentListSyntax = js.native
    
    def typeOfExpression(typeOfKeyword: ISyntaxToken, expression: IUnaryExpressionSyntax): TypeOfExpressionSyntax = js.native
    
    def typeParameter(identifier: ISyntaxToken, constraint: ConstraintSyntax): TypeParameterSyntax = js.native
    
    def typeParameterList(lessThanToken: ISyntaxToken, typeParameters: ISeparatedSyntaxList, greaterThanToken: ISyntaxToken): TypeParameterListSyntax = js.native
    
    def typeQuery(typeOfKeyword: ISyntaxToken, name: INameSyntax): TypeQuerySyntax = js.native
    
    def variableDeclaration(varKeyword: ISyntaxToken, variableDeclarators: ISeparatedSyntaxList): VariableDeclarationSyntax = js.native
    
    def variableDeclarator(
      propertyName: ISyntaxToken,
      typeAnnotation: TypeAnnotationSyntax,
      equalsValueClause: EqualsValueClauseSyntax
    ): VariableDeclaratorSyntax = js.native
    
    def variableStatement(
      modifiers: ISyntaxList,
      variableDeclaration: VariableDeclarationSyntax,
      semicolonToken: ISyntaxToken
    ): VariableStatementSyntax = js.native
    
    def voidExpression(voidKeyword: ISyntaxToken, expression: IUnaryExpressionSyntax): VoidExpressionSyntax = js.native
    
    def whileStatement(
      whileKeyword: ISyntaxToken,
      openParenToken: ISyntaxToken,
      condition: IExpressionSyntax,
      closeParenToken: ISyntaxToken,
      statement: IStatementSyntax
    ): WhileStatementSyntax = js.native
    
    def withStatement(
      withKeyword: ISyntaxToken,
      openParenToken: ISyntaxToken,
      condition: IExpressionSyntax,
      closeParenToken: ISyntaxToken,
      statement: IStatementSyntax
    ): WithStatementSyntax = js.native
  }
  object IFactory {
    
    @scala.inline
    def apply(
      argumentList: (TypeArgumentListSyntax, ISyntaxToken, ISeparatedSyntaxList, ISyntaxToken) => ArgumentListSyntax,
      arrayLiteralExpression: (ISyntaxToken, ISeparatedSyntaxList, ISyntaxToken) => ArrayLiteralExpressionSyntax,
      arrayType: (ITypeSyntax, ISyntaxToken, ISyntaxToken) => ArrayTypeSyntax,
      binaryExpression: (SyntaxKind, IExpressionSyntax, ISyntaxToken, IExpressionSyntax) => BinaryExpressionSyntax,
      block: (ISyntaxToken, ISyntaxList, ISyntaxToken) => BlockSyntax,
      breakStatement: (ISyntaxToken, ISyntaxToken, ISyntaxToken) => BreakStatementSyntax,
      callSignature: (TypeParameterListSyntax, ParameterListSyntax, TypeAnnotationSyntax) => CallSignatureSyntax,
      caseSwitchClause: (ISyntaxToken, IExpressionSyntax, ISyntaxToken, ISyntaxList) => CaseSwitchClauseSyntax,
      castExpression: (ISyntaxToken, ITypeSyntax, ISyntaxToken, IUnaryExpressionSyntax) => CastExpressionSyntax,
      catchClause: (ISyntaxToken, ISyntaxToken, ISyntaxToken, TypeAnnotationSyntax, ISyntaxToken, BlockSyntax) => CatchClauseSyntax,
      classDeclaration: (ISyntaxList, ISyntaxToken, ISyntaxToken, TypeParameterListSyntax, ISyntaxList, ISyntaxToken, ISyntaxList, ISyntaxToken) => ClassDeclarationSyntax,
      conditionalExpression: (IExpressionSyntax, ISyntaxToken, IExpressionSyntax, ISyntaxToken, IExpressionSyntax) => ConditionalExpressionSyntax,
      constraint: (ISyntaxToken, ITypeSyntax) => ConstraintSyntax,
      constructSignature: (ISyntaxToken, CallSignatureSyntax) => ConstructSignatureSyntax,
      constructorDeclaration: (ISyntaxList, ISyntaxToken, CallSignatureSyntax, BlockSyntax, ISyntaxToken) => ConstructorDeclarationSyntax,
      constructorType: (ISyntaxToken, TypeParameterListSyntax, ParameterListSyntax, ISyntaxToken, ITypeSyntax) => ConstructorTypeSyntax,
      continueStatement: (ISyntaxToken, ISyntaxToken, ISyntaxToken) => ContinueStatementSyntax,
      debuggerStatement: (ISyntaxToken, ISyntaxToken) => DebuggerStatementSyntax,
      defaultSwitchClause: (ISyntaxToken, ISyntaxToken, ISyntaxList) => DefaultSwitchClauseSyntax,
      deleteExpression: (ISyntaxToken, IUnaryExpressionSyntax) => DeleteExpressionSyntax,
      doStatement: (ISyntaxToken, IStatementSyntax, ISyntaxToken, ISyntaxToken, IExpressionSyntax, ISyntaxToken, ISyntaxToken) => DoStatementSyntax,
      elementAccessExpression: (IExpressionSyntax, ISyntaxToken, IExpressionSyntax, ISyntaxToken) => ElementAccessExpressionSyntax,
      elseClause: (ISyntaxToken, IStatementSyntax) => ElseClauseSyntax,
      emptyStatement: ISyntaxToken => EmptyStatementSyntax,
      enumDeclaration: (ISyntaxList, ISyntaxToken, ISyntaxToken, ISyntaxToken, ISeparatedSyntaxList, ISyntaxToken) => EnumDeclarationSyntax,
      enumElement: (ISyntaxToken, EqualsValueClauseSyntax) => EnumElementSyntax,
      equalsValueClause: (ISyntaxToken, IExpressionSyntax) => EqualsValueClauseSyntax,
      exportAssignment: (ISyntaxToken, ISyntaxToken, ISyntaxToken, ISyntaxToken) => ExportAssignmentSyntax,
      expressionStatement: (IExpressionSyntax, ISyntaxToken) => ExpressionStatementSyntax,
      externalModuleReference: (ISyntaxToken, ISyntaxToken, ISyntaxToken, ISyntaxToken) => ExternalModuleReferenceSyntax,
      finallyClause: (ISyntaxToken, BlockSyntax) => FinallyClauseSyntax,
      forInStatement: (ISyntaxToken, ISyntaxToken, VariableDeclarationSyntax, IExpressionSyntax, ISyntaxToken, IExpressionSyntax, ISyntaxToken, IStatementSyntax) => ForInStatementSyntax,
      forStatement: (ISyntaxToken, ISyntaxToken, VariableDeclarationSyntax, IExpressionSyntax, ISyntaxToken, IExpressionSyntax, ISyntaxToken, IExpressionSyntax, ISyntaxToken, IStatementSyntax) => ForStatementSyntax,
      functionDeclaration: (ISyntaxList, ISyntaxToken, ISyntaxToken, CallSignatureSyntax, BlockSyntax, ISyntaxToken) => FunctionDeclarationSyntax,
      functionExpression: (ISyntaxToken, ISyntaxToken, CallSignatureSyntax, BlockSyntax) => FunctionExpressionSyntax,
      functionPropertyAssignment: (ISyntaxToken, CallSignatureSyntax, BlockSyntax) => FunctionPropertyAssignmentSyntax,
      functionType: (TypeParameterListSyntax, ParameterListSyntax, ISyntaxToken, ITypeSyntax) => FunctionTypeSyntax,
      genericType: (INameSyntax, TypeArgumentListSyntax) => GenericTypeSyntax,
      getAccessor: (ISyntaxList, ISyntaxToken, ISyntaxToken, ParameterListSyntax, TypeAnnotationSyntax, BlockSyntax) => GetAccessorSyntax,
      heritageClause: (SyntaxKind, ISyntaxToken, ISeparatedSyntaxList) => HeritageClauseSyntax,
      ifStatement: (ISyntaxToken, ISyntaxToken, IExpressionSyntax, ISyntaxToken, IStatementSyntax, ElseClauseSyntax) => IfStatementSyntax,
      importDeclaration: (ISyntaxList, ISyntaxToken, ISyntaxToken, ISyntaxToken, IModuleReferenceSyntax, ISyntaxToken) => ImportDeclarationSyntax,
      indexMemberDeclaration: (ISyntaxList, IndexSignatureSyntax, ISyntaxToken) => IndexMemberDeclarationSyntax,
      indexSignature: (ISyntaxToken, ParameterSyntax, ISyntaxToken, TypeAnnotationSyntax) => IndexSignatureSyntax,
      interfaceDeclaration: (ISyntaxList, ISyntaxToken, ISyntaxToken, TypeParameterListSyntax, ISyntaxList, ObjectTypeSyntax) => InterfaceDeclarationSyntax,
      invocationExpression: (IMemberExpressionSyntax, ArgumentListSyntax) => InvocationExpressionSyntax,
      labeledStatement: (ISyntaxToken, ISyntaxToken, IStatementSyntax) => LabeledStatementSyntax,
      memberAccessExpression: (IExpressionSyntax, ISyntaxToken, ISyntaxToken) => MemberAccessExpressionSyntax,
      memberFunctionDeclaration: (ISyntaxList, ISyntaxToken, CallSignatureSyntax, BlockSyntax, ISyntaxToken) => MemberFunctionDeclarationSyntax,
      memberVariableDeclaration: (ISyntaxList, VariableDeclaratorSyntax, ISyntaxToken) => MemberVariableDeclarationSyntax,
      methodSignature: (ISyntaxToken, ISyntaxToken, CallSignatureSyntax) => MethodSignatureSyntax,
      moduleDeclaration: (ISyntaxList, ISyntaxToken, INameSyntax, ISyntaxToken, ISyntaxToken, ISyntaxList, ISyntaxToken) => ModuleDeclarationSyntax,
      moduleNameModuleReference: INameSyntax => ModuleNameModuleReferenceSyntax,
      objectCreationExpression: (ISyntaxToken, IMemberExpressionSyntax, ArgumentListSyntax) => ObjectCreationExpressionSyntax,
      objectLiteralExpression: (ISyntaxToken, ISeparatedSyntaxList, ISyntaxToken) => ObjectLiteralExpressionSyntax,
      objectType: (ISyntaxToken, ISeparatedSyntaxList, ISyntaxToken) => ObjectTypeSyntax,
      omittedExpression: () => OmittedExpressionSyntax,
      parameter: (ISyntaxToken, ISyntaxList, ISyntaxToken, ISyntaxToken, TypeAnnotationSyntax, EqualsValueClauseSyntax) => ParameterSyntax,
      parameterList: (ISyntaxToken, ISeparatedSyntaxList, ISyntaxToken) => ParameterListSyntax,
      parenthesizedArrowFunctionExpression: (CallSignatureSyntax, ISyntaxToken, BlockSyntax, IExpressionSyntax) => ParenthesizedArrowFunctionExpressionSyntax,
      parenthesizedExpression: (ISyntaxToken, IExpressionSyntax, ISyntaxToken) => ParenthesizedExpressionSyntax,
      postfixUnaryExpression: (SyntaxKind, IMemberExpressionSyntax, ISyntaxToken) => PostfixUnaryExpressionSyntax,
      prefixUnaryExpression: (SyntaxKind, ISyntaxToken, IUnaryExpressionSyntax) => PrefixUnaryExpressionSyntax,
      propertySignature: (ISyntaxToken, ISyntaxToken, TypeAnnotationSyntax) => PropertySignatureSyntax,
      qualifiedName: (INameSyntax, ISyntaxToken, ISyntaxToken) => QualifiedNameSyntax,
      returnStatement: (ISyntaxToken, IExpressionSyntax, ISyntaxToken) => ReturnStatementSyntax,
      setAccessor: (ISyntaxList, ISyntaxToken, ISyntaxToken, ParameterListSyntax, BlockSyntax) => SetAccessorSyntax,
      simpleArrowFunctionExpression: (ISyntaxToken, ISyntaxToken, BlockSyntax, IExpressionSyntax) => SimpleArrowFunctionExpressionSyntax,
      simplePropertyAssignment: (ISyntaxToken, ISyntaxToken, IExpressionSyntax) => SimplePropertyAssignmentSyntax,
      sourceUnit: (ISyntaxList, ISyntaxToken) => SourceUnitSyntax,
      switchStatement: (ISyntaxToken, ISyntaxToken, IExpressionSyntax, ISyntaxToken, ISyntaxToken, ISyntaxList, ISyntaxToken) => SwitchStatementSyntax,
      throwStatement: (ISyntaxToken, IExpressionSyntax, ISyntaxToken) => ThrowStatementSyntax,
      tryStatement: (ISyntaxToken, BlockSyntax, CatchClauseSyntax, FinallyClauseSyntax) => TryStatementSyntax,
      typeAnnotation: (ISyntaxToken, ITypeSyntax) => TypeAnnotationSyntax,
      typeArgumentList: (ISyntaxToken, ISeparatedSyntaxList, ISyntaxToken) => TypeArgumentListSyntax,
      typeOfExpression: (ISyntaxToken, IUnaryExpressionSyntax) => TypeOfExpressionSyntax,
      typeParameter: (ISyntaxToken, ConstraintSyntax) => TypeParameterSyntax,
      typeParameterList: (ISyntaxToken, ISeparatedSyntaxList, ISyntaxToken) => TypeParameterListSyntax,
      typeQuery: (ISyntaxToken, INameSyntax) => TypeQuerySyntax,
      variableDeclaration: (ISyntaxToken, ISeparatedSyntaxList) => VariableDeclarationSyntax,
      variableDeclarator: (ISyntaxToken, TypeAnnotationSyntax, EqualsValueClauseSyntax) => VariableDeclaratorSyntax,
      variableStatement: (ISyntaxList, VariableDeclarationSyntax, ISyntaxToken) => VariableStatementSyntax,
      voidExpression: (ISyntaxToken, IUnaryExpressionSyntax) => VoidExpressionSyntax,
      whileStatement: (ISyntaxToken, ISyntaxToken, IExpressionSyntax, ISyntaxToken, IStatementSyntax) => WhileStatementSyntax,
      withStatement: (ISyntaxToken, ISyntaxToken, IExpressionSyntax, ISyntaxToken, IStatementSyntax) => WithStatementSyntax
    ): IFactory = {
      val __obj = js.Dynamic.literal(argumentList = js.Any.fromFunction4(argumentList), arrayLiteralExpression = js.Any.fromFunction3(arrayLiteralExpression), arrayType = js.Any.fromFunction3(arrayType), binaryExpression = js.Any.fromFunction4(binaryExpression), block = js.Any.fromFunction3(block), breakStatement = js.Any.fromFunction3(breakStatement), callSignature = js.Any.fromFunction3(callSignature), caseSwitchClause = js.Any.fromFunction4(caseSwitchClause), castExpression = js.Any.fromFunction4(castExpression), catchClause = js.Any.fromFunction6(catchClause), classDeclaration = js.Any.fromFunction8(classDeclaration), conditionalExpression = js.Any.fromFunction5(conditionalExpression), constraint = js.Any.fromFunction2(constraint), constructSignature = js.Any.fromFunction2(constructSignature), constructorDeclaration = js.Any.fromFunction5(constructorDeclaration), constructorType = js.Any.fromFunction5(constructorType), continueStatement = js.Any.fromFunction3(continueStatement), debuggerStatement = js.Any.fromFunction2(debuggerStatement), defaultSwitchClause = js.Any.fromFunction3(defaultSwitchClause), deleteExpression = js.Any.fromFunction2(deleteExpression), doStatement = js.Any.fromFunction7(doStatement), elementAccessExpression = js.Any.fromFunction4(elementAccessExpression), elseClause = js.Any.fromFunction2(elseClause), emptyStatement = js.Any.fromFunction1(emptyStatement), enumDeclaration = js.Any.fromFunction6(enumDeclaration), enumElement = js.Any.fromFunction2(enumElement), equalsValueClause = js.Any.fromFunction2(equalsValueClause), exportAssignment = js.Any.fromFunction4(exportAssignment), expressionStatement = js.Any.fromFunction2(expressionStatement), externalModuleReference = js.Any.fromFunction4(externalModuleReference), finallyClause = js.Any.fromFunction2(finallyClause), forInStatement = js.Any.fromFunction8(forInStatement), forStatement = js.Any.fromFunction10(forStatement), functionDeclaration = js.Any.fromFunction6(functionDeclaration), functionExpression = js.Any.fromFunction4(functionExpression), functionPropertyAssignment = js.Any.fromFunction3(functionPropertyAssignment), functionType = js.Any.fromFunction4(functionType), genericType = js.Any.fromFunction2(genericType), getAccessor = js.Any.fromFunction6(getAccessor), heritageClause = js.Any.fromFunction3(heritageClause), ifStatement = js.Any.fromFunction6(ifStatement), importDeclaration = js.Any.fromFunction6(importDeclaration), indexMemberDeclaration = js.Any.fromFunction3(indexMemberDeclaration), indexSignature = js.Any.fromFunction4(indexSignature), interfaceDeclaration = js.Any.fromFunction6(interfaceDeclaration), invocationExpression = js.Any.fromFunction2(invocationExpression), labeledStatement = js.Any.fromFunction3(labeledStatement), memberAccessExpression = js.Any.fromFunction3(memberAccessExpression), memberFunctionDeclaration = js.Any.fromFunction5(memberFunctionDeclaration), memberVariableDeclaration = js.Any.fromFunction3(memberVariableDeclaration), methodSignature = js.Any.fromFunction3(methodSignature), moduleDeclaration = js.Any.fromFunction7(moduleDeclaration), moduleNameModuleReference = js.Any.fromFunction1(moduleNameModuleReference), objectCreationExpression = js.Any.fromFunction3(objectCreationExpression), objectLiteralExpression = js.Any.fromFunction3(objectLiteralExpression), objectType = js.Any.fromFunction3(objectType), omittedExpression = js.Any.fromFunction0(omittedExpression), parameter = js.Any.fromFunction6(parameter), parameterList = js.Any.fromFunction3(parameterList), parenthesizedArrowFunctionExpression = js.Any.fromFunction4(parenthesizedArrowFunctionExpression), parenthesizedExpression = js.Any.fromFunction3(parenthesizedExpression), postfixUnaryExpression = js.Any.fromFunction3(postfixUnaryExpression), prefixUnaryExpression = js.Any.fromFunction3(prefixUnaryExpression), propertySignature = js.Any.fromFunction3(propertySignature), qualifiedName = js.Any.fromFunction3(qualifiedName), returnStatement = js.Any.fromFunction3(returnStatement), setAccessor = js.Any.fromFunction5(setAccessor), simpleArrowFunctionExpression = js.Any.fromFunction4(simpleArrowFunctionExpression), simplePropertyAssignment = js.Any.fromFunction3(simplePropertyAssignment), sourceUnit = js.Any.fromFunction2(sourceUnit), switchStatement = js.Any.fromFunction7(switchStatement), throwStatement = js.Any.fromFunction3(throwStatement), tryStatement = js.Any.fromFunction4(tryStatement), typeAnnotation = js.Any.fromFunction2(typeAnnotation), typeArgumentList = js.Any.fromFunction3(typeArgumentList), typeOfExpression = js.Any.fromFunction2(typeOfExpression), typeParameter = js.Any.fromFunction2(typeParameter), typeParameterList = js.Any.fromFunction3(typeParameterList), typeQuery = js.Any.fromFunction2(typeQuery), variableDeclaration = js.Any.fromFunction2(variableDeclaration), variableDeclarator = js.Any.fromFunction3(variableDeclarator), variableStatement = js.Any.fromFunction3(variableStatement), voidExpression = js.Any.fromFunction2(voidExpression), whileStatement = js.Any.fromFunction5(whileStatement), withStatement = js.Any.fromFunction5(withStatement))
      __obj.asInstanceOf[IFactory]
    }
    
    @scala.inline
    implicit class IFactoryMutableBuilder[Self <: IFactory] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArgumentList(
        value: (TypeArgumentListSyntax, ISyntaxToken, ISeparatedSyntaxList, ISyntaxToken) => ArgumentListSyntax
      ): Self = StObject.set(x, "argumentList", js.Any.fromFunction4(value))
      
      @scala.inline
      def setArrayLiteralExpression(value: (ISyntaxToken, ISeparatedSyntaxList, ISyntaxToken) => ArrayLiteralExpressionSyntax): Self = StObject.set(x, "arrayLiteralExpression", js.Any.fromFunction3(value))
      
      @scala.inline
      def setArrayType(value: (ITypeSyntax, ISyntaxToken, ISyntaxToken) => ArrayTypeSyntax): Self = StObject.set(x, "arrayType", js.Any.fromFunction3(value))
      
      @scala.inline
      def setBinaryExpression(value: (SyntaxKind, IExpressionSyntax, ISyntaxToken, IExpressionSyntax) => BinaryExpressionSyntax): Self = StObject.set(x, "binaryExpression", js.Any.fromFunction4(value))
      
      @scala.inline
      def setBlock(value: (ISyntaxToken, ISyntaxList, ISyntaxToken) => BlockSyntax): Self = StObject.set(x, "block", js.Any.fromFunction3(value))
      
      @scala.inline
      def setBreakStatement(value: (ISyntaxToken, ISyntaxToken, ISyntaxToken) => BreakStatementSyntax): Self = StObject.set(x, "breakStatement", js.Any.fromFunction3(value))
      
      @scala.inline
      def setCallSignature(value: (TypeParameterListSyntax, ParameterListSyntax, TypeAnnotationSyntax) => CallSignatureSyntax): Self = StObject.set(x, "callSignature", js.Any.fromFunction3(value))
      
      @scala.inline
      def setCaseSwitchClause(value: (ISyntaxToken, IExpressionSyntax, ISyntaxToken, ISyntaxList) => CaseSwitchClauseSyntax): Self = StObject.set(x, "caseSwitchClause", js.Any.fromFunction4(value))
      
      @scala.inline
      def setCastExpression(value: (ISyntaxToken, ITypeSyntax, ISyntaxToken, IUnaryExpressionSyntax) => CastExpressionSyntax): Self = StObject.set(x, "castExpression", js.Any.fromFunction4(value))
      
      @scala.inline
      def setCatchClause(
        value: (ISyntaxToken, ISyntaxToken, ISyntaxToken, TypeAnnotationSyntax, ISyntaxToken, BlockSyntax) => CatchClauseSyntax
      ): Self = StObject.set(x, "catchClause", js.Any.fromFunction6(value))
      
      @scala.inline
      def setClassDeclaration(
        value: (ISyntaxList, ISyntaxToken, ISyntaxToken, TypeParameterListSyntax, ISyntaxList, ISyntaxToken, ISyntaxList, ISyntaxToken) => ClassDeclarationSyntax
      ): Self = StObject.set(x, "classDeclaration", js.Any.fromFunction8(value))
      
      @scala.inline
      def setConditionalExpression(
        value: (IExpressionSyntax, ISyntaxToken, IExpressionSyntax, ISyntaxToken, IExpressionSyntax) => ConditionalExpressionSyntax
      ): Self = StObject.set(x, "conditionalExpression", js.Any.fromFunction5(value))
      
      @scala.inline
      def setConstraint(value: (ISyntaxToken, ITypeSyntax) => ConstraintSyntax): Self = StObject.set(x, "constraint", js.Any.fromFunction2(value))
      
      @scala.inline
      def setConstructSignature(value: (ISyntaxToken, CallSignatureSyntax) => ConstructSignatureSyntax): Self = StObject.set(x, "constructSignature", js.Any.fromFunction2(value))
      
      @scala.inline
      def setConstructorDeclaration(
        value: (ISyntaxList, ISyntaxToken, CallSignatureSyntax, BlockSyntax, ISyntaxToken) => ConstructorDeclarationSyntax
      ): Self = StObject.set(x, "constructorDeclaration", js.Any.fromFunction5(value))
      
      @scala.inline
      def setConstructorType(
        value: (ISyntaxToken, TypeParameterListSyntax, ParameterListSyntax, ISyntaxToken, ITypeSyntax) => ConstructorTypeSyntax
      ): Self = StObject.set(x, "constructorType", js.Any.fromFunction5(value))
      
      @scala.inline
      def setContinueStatement(value: (ISyntaxToken, ISyntaxToken, ISyntaxToken) => ContinueStatementSyntax): Self = StObject.set(x, "continueStatement", js.Any.fromFunction3(value))
      
      @scala.inline
      def setDebuggerStatement(value: (ISyntaxToken, ISyntaxToken) => DebuggerStatementSyntax): Self = StObject.set(x, "debuggerStatement", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDefaultSwitchClause(value: (ISyntaxToken, ISyntaxToken, ISyntaxList) => DefaultSwitchClauseSyntax): Self = StObject.set(x, "defaultSwitchClause", js.Any.fromFunction3(value))
      
      @scala.inline
      def setDeleteExpression(value: (ISyntaxToken, IUnaryExpressionSyntax) => DeleteExpressionSyntax): Self = StObject.set(x, "deleteExpression", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDoStatement(
        value: (ISyntaxToken, IStatementSyntax, ISyntaxToken, ISyntaxToken, IExpressionSyntax, ISyntaxToken, ISyntaxToken) => DoStatementSyntax
      ): Self = StObject.set(x, "doStatement", js.Any.fromFunction7(value))
      
      @scala.inline
      def setElementAccessExpression(
        value: (IExpressionSyntax, ISyntaxToken, IExpressionSyntax, ISyntaxToken) => ElementAccessExpressionSyntax
      ): Self = StObject.set(x, "elementAccessExpression", js.Any.fromFunction4(value))
      
      @scala.inline
      def setElseClause(value: (ISyntaxToken, IStatementSyntax) => ElseClauseSyntax): Self = StObject.set(x, "elseClause", js.Any.fromFunction2(value))
      
      @scala.inline
      def setEmptyStatement(value: ISyntaxToken => EmptyStatementSyntax): Self = StObject.set(x, "emptyStatement", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEnumDeclaration(
        value: (ISyntaxList, ISyntaxToken, ISyntaxToken, ISyntaxToken, ISeparatedSyntaxList, ISyntaxToken) => EnumDeclarationSyntax
      ): Self = StObject.set(x, "enumDeclaration", js.Any.fromFunction6(value))
      
      @scala.inline
      def setEnumElement(value: (ISyntaxToken, EqualsValueClauseSyntax) => EnumElementSyntax): Self = StObject.set(x, "enumElement", js.Any.fromFunction2(value))
      
      @scala.inline
      def setEqualsValueClause(value: (ISyntaxToken, IExpressionSyntax) => EqualsValueClauseSyntax): Self = StObject.set(x, "equalsValueClause", js.Any.fromFunction2(value))
      
      @scala.inline
      def setExportAssignment(value: (ISyntaxToken, ISyntaxToken, ISyntaxToken, ISyntaxToken) => ExportAssignmentSyntax): Self = StObject.set(x, "exportAssignment", js.Any.fromFunction4(value))
      
      @scala.inline
      def setExpressionStatement(value: (IExpressionSyntax, ISyntaxToken) => ExpressionStatementSyntax): Self = StObject.set(x, "expressionStatement", js.Any.fromFunction2(value))
      
      @scala.inline
      def setExternalModuleReference(value: (ISyntaxToken, ISyntaxToken, ISyntaxToken, ISyntaxToken) => ExternalModuleReferenceSyntax): Self = StObject.set(x, "externalModuleReference", js.Any.fromFunction4(value))
      
      @scala.inline
      def setFinallyClause(value: (ISyntaxToken, BlockSyntax) => FinallyClauseSyntax): Self = StObject.set(x, "finallyClause", js.Any.fromFunction2(value))
      
      @scala.inline
      def setForInStatement(
        value: (ISyntaxToken, ISyntaxToken, VariableDeclarationSyntax, IExpressionSyntax, ISyntaxToken, IExpressionSyntax, ISyntaxToken, IStatementSyntax) => ForInStatementSyntax
      ): Self = StObject.set(x, "forInStatement", js.Any.fromFunction8(value))
      
      @scala.inline
      def setForStatement(
        value: (ISyntaxToken, ISyntaxToken, VariableDeclarationSyntax, IExpressionSyntax, ISyntaxToken, IExpressionSyntax, ISyntaxToken, IExpressionSyntax, ISyntaxToken, IStatementSyntax) => ForStatementSyntax
      ): Self = StObject.set(x, "forStatement", js.Any.fromFunction10(value))
      
      @scala.inline
      def setFunctionDeclaration(
        value: (ISyntaxList, ISyntaxToken, ISyntaxToken, CallSignatureSyntax, BlockSyntax, ISyntaxToken) => FunctionDeclarationSyntax
      ): Self = StObject.set(x, "functionDeclaration", js.Any.fromFunction6(value))
      
      @scala.inline
      def setFunctionExpression(value: (ISyntaxToken, ISyntaxToken, CallSignatureSyntax, BlockSyntax) => FunctionExpressionSyntax): Self = StObject.set(x, "functionExpression", js.Any.fromFunction4(value))
      
      @scala.inline
      def setFunctionPropertyAssignment(value: (ISyntaxToken, CallSignatureSyntax, BlockSyntax) => FunctionPropertyAssignmentSyntax): Self = StObject.set(x, "functionPropertyAssignment", js.Any.fromFunction3(value))
      
      @scala.inline
      def setFunctionType(
        value: (TypeParameterListSyntax, ParameterListSyntax, ISyntaxToken, ITypeSyntax) => FunctionTypeSyntax
      ): Self = StObject.set(x, "functionType", js.Any.fromFunction4(value))
      
      @scala.inline
      def setGenericType(value: (INameSyntax, TypeArgumentListSyntax) => GenericTypeSyntax): Self = StObject.set(x, "genericType", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetAccessor(
        value: (ISyntaxList, ISyntaxToken, ISyntaxToken, ParameterListSyntax, TypeAnnotationSyntax, BlockSyntax) => GetAccessorSyntax
      ): Self = StObject.set(x, "getAccessor", js.Any.fromFunction6(value))
      
      @scala.inline
      def setHeritageClause(value: (SyntaxKind, ISyntaxToken, ISeparatedSyntaxList) => HeritageClauseSyntax): Self = StObject.set(x, "heritageClause", js.Any.fromFunction3(value))
      
      @scala.inline
      def setIfStatement(
        value: (ISyntaxToken, ISyntaxToken, IExpressionSyntax, ISyntaxToken, IStatementSyntax, ElseClauseSyntax) => IfStatementSyntax
      ): Self = StObject.set(x, "ifStatement", js.Any.fromFunction6(value))
      
      @scala.inline
      def setImportDeclaration(
        value: (ISyntaxList, ISyntaxToken, ISyntaxToken, ISyntaxToken, IModuleReferenceSyntax, ISyntaxToken) => ImportDeclarationSyntax
      ): Self = StObject.set(x, "importDeclaration", js.Any.fromFunction6(value))
      
      @scala.inline
      def setIndexMemberDeclaration(value: (ISyntaxList, IndexSignatureSyntax, ISyntaxToken) => IndexMemberDeclarationSyntax): Self = StObject.set(x, "indexMemberDeclaration", js.Any.fromFunction3(value))
      
      @scala.inline
      def setIndexSignature(value: (ISyntaxToken, ParameterSyntax, ISyntaxToken, TypeAnnotationSyntax) => IndexSignatureSyntax): Self = StObject.set(x, "indexSignature", js.Any.fromFunction4(value))
      
      @scala.inline
      def setInterfaceDeclaration(
        value: (ISyntaxList, ISyntaxToken, ISyntaxToken, TypeParameterListSyntax, ISyntaxList, ObjectTypeSyntax) => InterfaceDeclarationSyntax
      ): Self = StObject.set(x, "interfaceDeclaration", js.Any.fromFunction6(value))
      
      @scala.inline
      def setInvocationExpression(value: (IMemberExpressionSyntax, ArgumentListSyntax) => InvocationExpressionSyntax): Self = StObject.set(x, "invocationExpression", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLabeledStatement(value: (ISyntaxToken, ISyntaxToken, IStatementSyntax) => LabeledStatementSyntax): Self = StObject.set(x, "labeledStatement", js.Any.fromFunction3(value))
      
      @scala.inline
      def setMemberAccessExpression(value: (IExpressionSyntax, ISyntaxToken, ISyntaxToken) => MemberAccessExpressionSyntax): Self = StObject.set(x, "memberAccessExpression", js.Any.fromFunction3(value))
      
      @scala.inline
      def setMemberFunctionDeclaration(
        value: (ISyntaxList, ISyntaxToken, CallSignatureSyntax, BlockSyntax, ISyntaxToken) => MemberFunctionDeclarationSyntax
      ): Self = StObject.set(x, "memberFunctionDeclaration", js.Any.fromFunction5(value))
      
      @scala.inline
      def setMemberVariableDeclaration(value: (ISyntaxList, VariableDeclaratorSyntax, ISyntaxToken) => MemberVariableDeclarationSyntax): Self = StObject.set(x, "memberVariableDeclaration", js.Any.fromFunction3(value))
      
      @scala.inline
      def setMethodSignature(value: (ISyntaxToken, ISyntaxToken, CallSignatureSyntax) => MethodSignatureSyntax): Self = StObject.set(x, "methodSignature", js.Any.fromFunction3(value))
      
      @scala.inline
      def setModuleDeclaration(
        value: (ISyntaxList, ISyntaxToken, INameSyntax, ISyntaxToken, ISyntaxToken, ISyntaxList, ISyntaxToken) => ModuleDeclarationSyntax
      ): Self = StObject.set(x, "moduleDeclaration", js.Any.fromFunction7(value))
      
      @scala.inline
      def setModuleNameModuleReference(value: INameSyntax => ModuleNameModuleReferenceSyntax): Self = StObject.set(x, "moduleNameModuleReference", js.Any.fromFunction1(value))
      
      @scala.inline
      def setObjectCreationExpression(
        value: (ISyntaxToken, IMemberExpressionSyntax, ArgumentListSyntax) => ObjectCreationExpressionSyntax
      ): Self = StObject.set(x, "objectCreationExpression", js.Any.fromFunction3(value))
      
      @scala.inline
      def setObjectLiteralExpression(value: (ISyntaxToken, ISeparatedSyntaxList, ISyntaxToken) => ObjectLiteralExpressionSyntax): Self = StObject.set(x, "objectLiteralExpression", js.Any.fromFunction3(value))
      
      @scala.inline
      def setObjectType(value: (ISyntaxToken, ISeparatedSyntaxList, ISyntaxToken) => ObjectTypeSyntax): Self = StObject.set(x, "objectType", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOmittedExpression(value: () => OmittedExpressionSyntax): Self = StObject.set(x, "omittedExpression", js.Any.fromFunction0(value))
      
      @scala.inline
      def setParameter(
        value: (ISyntaxToken, ISyntaxList, ISyntaxToken, ISyntaxToken, TypeAnnotationSyntax, EqualsValueClauseSyntax) => ParameterSyntax
      ): Self = StObject.set(x, "parameter", js.Any.fromFunction6(value))
      
      @scala.inline
      def setParameterList(value: (ISyntaxToken, ISeparatedSyntaxList, ISyntaxToken) => ParameterListSyntax): Self = StObject.set(x, "parameterList", js.Any.fromFunction3(value))
      
      @scala.inline
      def setParenthesizedArrowFunctionExpression(
        value: (CallSignatureSyntax, ISyntaxToken, BlockSyntax, IExpressionSyntax) => ParenthesizedArrowFunctionExpressionSyntax
      ): Self = StObject.set(x, "parenthesizedArrowFunctionExpression", js.Any.fromFunction4(value))
      
      @scala.inline
      def setParenthesizedExpression(value: (ISyntaxToken, IExpressionSyntax, ISyntaxToken) => ParenthesizedExpressionSyntax): Self = StObject.set(x, "parenthesizedExpression", js.Any.fromFunction3(value))
      
      @scala.inline
      def setPostfixUnaryExpression(value: (SyntaxKind, IMemberExpressionSyntax, ISyntaxToken) => PostfixUnaryExpressionSyntax): Self = StObject.set(x, "postfixUnaryExpression", js.Any.fromFunction3(value))
      
      @scala.inline
      def setPrefixUnaryExpression(value: (SyntaxKind, ISyntaxToken, IUnaryExpressionSyntax) => PrefixUnaryExpressionSyntax): Self = StObject.set(x, "prefixUnaryExpression", js.Any.fromFunction3(value))
      
      @scala.inline
      def setPropertySignature(value: (ISyntaxToken, ISyntaxToken, TypeAnnotationSyntax) => PropertySignatureSyntax): Self = StObject.set(x, "propertySignature", js.Any.fromFunction3(value))
      
      @scala.inline
      def setQualifiedName(value: (INameSyntax, ISyntaxToken, ISyntaxToken) => QualifiedNameSyntax): Self = StObject.set(x, "qualifiedName", js.Any.fromFunction3(value))
      
      @scala.inline
      def setReturnStatement(value: (ISyntaxToken, IExpressionSyntax, ISyntaxToken) => ReturnStatementSyntax): Self = StObject.set(x, "returnStatement", js.Any.fromFunction3(value))
      
      @scala.inline
      def setSetAccessor(
        value: (ISyntaxList, ISyntaxToken, ISyntaxToken, ParameterListSyntax, BlockSyntax) => SetAccessorSyntax
      ): Self = StObject.set(x, "setAccessor", js.Any.fromFunction5(value))
      
      @scala.inline
      def setSimpleArrowFunctionExpression(
        value: (ISyntaxToken, ISyntaxToken, BlockSyntax, IExpressionSyntax) => SimpleArrowFunctionExpressionSyntax
      ): Self = StObject.set(x, "simpleArrowFunctionExpression", js.Any.fromFunction4(value))
      
      @scala.inline
      def setSimplePropertyAssignment(value: (ISyntaxToken, ISyntaxToken, IExpressionSyntax) => SimplePropertyAssignmentSyntax): Self = StObject.set(x, "simplePropertyAssignment", js.Any.fromFunction3(value))
      
      @scala.inline
      def setSourceUnit(value: (ISyntaxList, ISyntaxToken) => SourceUnitSyntax): Self = StObject.set(x, "sourceUnit", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSwitchStatement(
        value: (ISyntaxToken, ISyntaxToken, IExpressionSyntax, ISyntaxToken, ISyntaxToken, ISyntaxList, ISyntaxToken) => SwitchStatementSyntax
      ): Self = StObject.set(x, "switchStatement", js.Any.fromFunction7(value))
      
      @scala.inline
      def setThrowStatement(value: (ISyntaxToken, IExpressionSyntax, ISyntaxToken) => ThrowStatementSyntax): Self = StObject.set(x, "throwStatement", js.Any.fromFunction3(value))
      
      @scala.inline
      def setTryStatement(value: (ISyntaxToken, BlockSyntax, CatchClauseSyntax, FinallyClauseSyntax) => TryStatementSyntax): Self = StObject.set(x, "tryStatement", js.Any.fromFunction4(value))
      
      @scala.inline
      def setTypeAnnotation(value: (ISyntaxToken, ITypeSyntax) => TypeAnnotationSyntax): Self = StObject.set(x, "typeAnnotation", js.Any.fromFunction2(value))
      
      @scala.inline
      def setTypeArgumentList(value: (ISyntaxToken, ISeparatedSyntaxList, ISyntaxToken) => TypeArgumentListSyntax): Self = StObject.set(x, "typeArgumentList", js.Any.fromFunction3(value))
      
      @scala.inline
      def setTypeOfExpression(value: (ISyntaxToken, IUnaryExpressionSyntax) => TypeOfExpressionSyntax): Self = StObject.set(x, "typeOfExpression", js.Any.fromFunction2(value))
      
      @scala.inline
      def setTypeParameter(value: (ISyntaxToken, ConstraintSyntax) => TypeParameterSyntax): Self = StObject.set(x, "typeParameter", js.Any.fromFunction2(value))
      
      @scala.inline
      def setTypeParameterList(value: (ISyntaxToken, ISeparatedSyntaxList, ISyntaxToken) => TypeParameterListSyntax): Self = StObject.set(x, "typeParameterList", js.Any.fromFunction3(value))
      
      @scala.inline
      def setTypeQuery(value: (ISyntaxToken, INameSyntax) => TypeQuerySyntax): Self = StObject.set(x, "typeQuery", js.Any.fromFunction2(value))
      
      @scala.inline
      def setVariableDeclaration(value: (ISyntaxToken, ISeparatedSyntaxList) => VariableDeclarationSyntax): Self = StObject.set(x, "variableDeclaration", js.Any.fromFunction2(value))
      
      @scala.inline
      def setVariableDeclarator(value: (ISyntaxToken, TypeAnnotationSyntax, EqualsValueClauseSyntax) => VariableDeclaratorSyntax): Self = StObject.set(x, "variableDeclarator", js.Any.fromFunction3(value))
      
      @scala.inline
      def setVariableStatement(value: (ISyntaxList, VariableDeclarationSyntax, ISyntaxToken) => VariableStatementSyntax): Self = StObject.set(x, "variableStatement", js.Any.fromFunction3(value))
      
      @scala.inline
      def setVoidExpression(value: (ISyntaxToken, IUnaryExpressionSyntax) => VoidExpressionSyntax): Self = StObject.set(x, "voidExpression", js.Any.fromFunction2(value))
      
      @scala.inline
      def setWhileStatement(
        value: (ISyntaxToken, ISyntaxToken, IExpressionSyntax, ISyntaxToken, IStatementSyntax) => WhileStatementSyntax
      ): Self = StObject.set(x, "whileStatement", js.Any.fromFunction5(value))
      
      @scala.inline
      def setWithStatement(
        value: (ISyntaxToken, ISyntaxToken, IExpressionSyntax, ISyntaxToken, IStatementSyntax) => WithStatementSyntax
      ): Self = StObject.set(x, "withStatement", js.Any.fromFunction5(value))
    }
  }
  
  @js.native
  trait NormalModeFactory extends IFactory
  object NormalModeFactory {
    
    @scala.inline
    def apply(
      argumentList: (TypeArgumentListSyntax, ISyntaxToken, ISeparatedSyntaxList, ISyntaxToken) => ArgumentListSyntax,
      arrayLiteralExpression: (ISyntaxToken, ISeparatedSyntaxList, ISyntaxToken) => ArrayLiteralExpressionSyntax,
      arrayType: (ITypeSyntax, ISyntaxToken, ISyntaxToken) => ArrayTypeSyntax,
      binaryExpression: (SyntaxKind, IExpressionSyntax, ISyntaxToken, IExpressionSyntax) => BinaryExpressionSyntax,
      block: (ISyntaxToken, ISyntaxList, ISyntaxToken) => BlockSyntax,
      breakStatement: (ISyntaxToken, ISyntaxToken, ISyntaxToken) => BreakStatementSyntax,
      callSignature: (TypeParameterListSyntax, ParameterListSyntax, TypeAnnotationSyntax) => CallSignatureSyntax,
      caseSwitchClause: (ISyntaxToken, IExpressionSyntax, ISyntaxToken, ISyntaxList) => CaseSwitchClauseSyntax,
      castExpression: (ISyntaxToken, ITypeSyntax, ISyntaxToken, IUnaryExpressionSyntax) => CastExpressionSyntax,
      catchClause: (ISyntaxToken, ISyntaxToken, ISyntaxToken, TypeAnnotationSyntax, ISyntaxToken, BlockSyntax) => CatchClauseSyntax,
      classDeclaration: (ISyntaxList, ISyntaxToken, ISyntaxToken, TypeParameterListSyntax, ISyntaxList, ISyntaxToken, ISyntaxList, ISyntaxToken) => ClassDeclarationSyntax,
      conditionalExpression: (IExpressionSyntax, ISyntaxToken, IExpressionSyntax, ISyntaxToken, IExpressionSyntax) => ConditionalExpressionSyntax,
      constraint: (ISyntaxToken, ITypeSyntax) => ConstraintSyntax,
      constructSignature: (ISyntaxToken, CallSignatureSyntax) => ConstructSignatureSyntax,
      constructorDeclaration: (ISyntaxList, ISyntaxToken, CallSignatureSyntax, BlockSyntax, ISyntaxToken) => ConstructorDeclarationSyntax,
      constructorType: (ISyntaxToken, TypeParameterListSyntax, ParameterListSyntax, ISyntaxToken, ITypeSyntax) => ConstructorTypeSyntax,
      continueStatement: (ISyntaxToken, ISyntaxToken, ISyntaxToken) => ContinueStatementSyntax,
      debuggerStatement: (ISyntaxToken, ISyntaxToken) => DebuggerStatementSyntax,
      defaultSwitchClause: (ISyntaxToken, ISyntaxToken, ISyntaxList) => DefaultSwitchClauseSyntax,
      deleteExpression: (ISyntaxToken, IUnaryExpressionSyntax) => DeleteExpressionSyntax,
      doStatement: (ISyntaxToken, IStatementSyntax, ISyntaxToken, ISyntaxToken, IExpressionSyntax, ISyntaxToken, ISyntaxToken) => DoStatementSyntax,
      elementAccessExpression: (IExpressionSyntax, ISyntaxToken, IExpressionSyntax, ISyntaxToken) => ElementAccessExpressionSyntax,
      elseClause: (ISyntaxToken, IStatementSyntax) => ElseClauseSyntax,
      emptyStatement: ISyntaxToken => EmptyStatementSyntax,
      enumDeclaration: (ISyntaxList, ISyntaxToken, ISyntaxToken, ISyntaxToken, ISeparatedSyntaxList, ISyntaxToken) => EnumDeclarationSyntax,
      enumElement: (ISyntaxToken, EqualsValueClauseSyntax) => EnumElementSyntax,
      equalsValueClause: (ISyntaxToken, IExpressionSyntax) => EqualsValueClauseSyntax,
      exportAssignment: (ISyntaxToken, ISyntaxToken, ISyntaxToken, ISyntaxToken) => ExportAssignmentSyntax,
      expressionStatement: (IExpressionSyntax, ISyntaxToken) => ExpressionStatementSyntax,
      externalModuleReference: (ISyntaxToken, ISyntaxToken, ISyntaxToken, ISyntaxToken) => ExternalModuleReferenceSyntax,
      finallyClause: (ISyntaxToken, BlockSyntax) => FinallyClauseSyntax,
      forInStatement: (ISyntaxToken, ISyntaxToken, VariableDeclarationSyntax, IExpressionSyntax, ISyntaxToken, IExpressionSyntax, ISyntaxToken, IStatementSyntax) => ForInStatementSyntax,
      forStatement: (ISyntaxToken, ISyntaxToken, VariableDeclarationSyntax, IExpressionSyntax, ISyntaxToken, IExpressionSyntax, ISyntaxToken, IExpressionSyntax, ISyntaxToken, IStatementSyntax) => ForStatementSyntax,
      functionDeclaration: (ISyntaxList, ISyntaxToken, ISyntaxToken, CallSignatureSyntax, BlockSyntax, ISyntaxToken) => FunctionDeclarationSyntax,
      functionExpression: (ISyntaxToken, ISyntaxToken, CallSignatureSyntax, BlockSyntax) => FunctionExpressionSyntax,
      functionPropertyAssignment: (ISyntaxToken, CallSignatureSyntax, BlockSyntax) => FunctionPropertyAssignmentSyntax,
      functionType: (TypeParameterListSyntax, ParameterListSyntax, ISyntaxToken, ITypeSyntax) => FunctionTypeSyntax,
      genericType: (INameSyntax, TypeArgumentListSyntax) => GenericTypeSyntax,
      getAccessor: (ISyntaxList, ISyntaxToken, ISyntaxToken, ParameterListSyntax, TypeAnnotationSyntax, BlockSyntax) => GetAccessorSyntax,
      heritageClause: (SyntaxKind, ISyntaxToken, ISeparatedSyntaxList) => HeritageClauseSyntax,
      ifStatement: (ISyntaxToken, ISyntaxToken, IExpressionSyntax, ISyntaxToken, IStatementSyntax, ElseClauseSyntax) => IfStatementSyntax,
      importDeclaration: (ISyntaxList, ISyntaxToken, ISyntaxToken, ISyntaxToken, IModuleReferenceSyntax, ISyntaxToken) => ImportDeclarationSyntax,
      indexMemberDeclaration: (ISyntaxList, IndexSignatureSyntax, ISyntaxToken) => IndexMemberDeclarationSyntax,
      indexSignature: (ISyntaxToken, ParameterSyntax, ISyntaxToken, TypeAnnotationSyntax) => IndexSignatureSyntax,
      interfaceDeclaration: (ISyntaxList, ISyntaxToken, ISyntaxToken, TypeParameterListSyntax, ISyntaxList, ObjectTypeSyntax) => InterfaceDeclarationSyntax,
      invocationExpression: (IMemberExpressionSyntax, ArgumentListSyntax) => InvocationExpressionSyntax,
      labeledStatement: (ISyntaxToken, ISyntaxToken, IStatementSyntax) => LabeledStatementSyntax,
      memberAccessExpression: (IExpressionSyntax, ISyntaxToken, ISyntaxToken) => MemberAccessExpressionSyntax,
      memberFunctionDeclaration: (ISyntaxList, ISyntaxToken, CallSignatureSyntax, BlockSyntax, ISyntaxToken) => MemberFunctionDeclarationSyntax,
      memberVariableDeclaration: (ISyntaxList, VariableDeclaratorSyntax, ISyntaxToken) => MemberVariableDeclarationSyntax,
      methodSignature: (ISyntaxToken, ISyntaxToken, CallSignatureSyntax) => MethodSignatureSyntax,
      moduleDeclaration: (ISyntaxList, ISyntaxToken, INameSyntax, ISyntaxToken, ISyntaxToken, ISyntaxList, ISyntaxToken) => ModuleDeclarationSyntax,
      moduleNameModuleReference: INameSyntax => ModuleNameModuleReferenceSyntax,
      objectCreationExpression: (ISyntaxToken, IMemberExpressionSyntax, ArgumentListSyntax) => ObjectCreationExpressionSyntax,
      objectLiteralExpression: (ISyntaxToken, ISeparatedSyntaxList, ISyntaxToken) => ObjectLiteralExpressionSyntax,
      objectType: (ISyntaxToken, ISeparatedSyntaxList, ISyntaxToken) => ObjectTypeSyntax,
      omittedExpression: () => OmittedExpressionSyntax,
      parameter: (ISyntaxToken, ISyntaxList, ISyntaxToken, ISyntaxToken, TypeAnnotationSyntax, EqualsValueClauseSyntax) => ParameterSyntax,
      parameterList: (ISyntaxToken, ISeparatedSyntaxList, ISyntaxToken) => ParameterListSyntax,
      parenthesizedArrowFunctionExpression: (CallSignatureSyntax, ISyntaxToken, BlockSyntax, IExpressionSyntax) => ParenthesizedArrowFunctionExpressionSyntax,
      parenthesizedExpression: (ISyntaxToken, IExpressionSyntax, ISyntaxToken) => ParenthesizedExpressionSyntax,
      postfixUnaryExpression: (SyntaxKind, IMemberExpressionSyntax, ISyntaxToken) => PostfixUnaryExpressionSyntax,
      prefixUnaryExpression: (SyntaxKind, ISyntaxToken, IUnaryExpressionSyntax) => PrefixUnaryExpressionSyntax,
      propertySignature: (ISyntaxToken, ISyntaxToken, TypeAnnotationSyntax) => PropertySignatureSyntax,
      qualifiedName: (INameSyntax, ISyntaxToken, ISyntaxToken) => QualifiedNameSyntax,
      returnStatement: (ISyntaxToken, IExpressionSyntax, ISyntaxToken) => ReturnStatementSyntax,
      setAccessor: (ISyntaxList, ISyntaxToken, ISyntaxToken, ParameterListSyntax, BlockSyntax) => SetAccessorSyntax,
      simpleArrowFunctionExpression: (ISyntaxToken, ISyntaxToken, BlockSyntax, IExpressionSyntax) => SimpleArrowFunctionExpressionSyntax,
      simplePropertyAssignment: (ISyntaxToken, ISyntaxToken, IExpressionSyntax) => SimplePropertyAssignmentSyntax,
      sourceUnit: (ISyntaxList, ISyntaxToken) => SourceUnitSyntax,
      switchStatement: (ISyntaxToken, ISyntaxToken, IExpressionSyntax, ISyntaxToken, ISyntaxToken, ISyntaxList, ISyntaxToken) => SwitchStatementSyntax,
      throwStatement: (ISyntaxToken, IExpressionSyntax, ISyntaxToken) => ThrowStatementSyntax,
      tryStatement: (ISyntaxToken, BlockSyntax, CatchClauseSyntax, FinallyClauseSyntax) => TryStatementSyntax,
      typeAnnotation: (ISyntaxToken, ITypeSyntax) => TypeAnnotationSyntax,
      typeArgumentList: (ISyntaxToken, ISeparatedSyntaxList, ISyntaxToken) => TypeArgumentListSyntax,
      typeOfExpression: (ISyntaxToken, IUnaryExpressionSyntax) => TypeOfExpressionSyntax,
      typeParameter: (ISyntaxToken, ConstraintSyntax) => TypeParameterSyntax,
      typeParameterList: (ISyntaxToken, ISeparatedSyntaxList, ISyntaxToken) => TypeParameterListSyntax,
      typeQuery: (ISyntaxToken, INameSyntax) => TypeQuerySyntax,
      variableDeclaration: (ISyntaxToken, ISeparatedSyntaxList) => VariableDeclarationSyntax,
      variableDeclarator: (ISyntaxToken, TypeAnnotationSyntax, EqualsValueClauseSyntax) => VariableDeclaratorSyntax,
      variableStatement: (ISyntaxList, VariableDeclarationSyntax, ISyntaxToken) => VariableStatementSyntax,
      voidExpression: (ISyntaxToken, IUnaryExpressionSyntax) => VoidExpressionSyntax,
      whileStatement: (ISyntaxToken, ISyntaxToken, IExpressionSyntax, ISyntaxToken, IStatementSyntax) => WhileStatementSyntax,
      withStatement: (ISyntaxToken, ISyntaxToken, IExpressionSyntax, ISyntaxToken, IStatementSyntax) => WithStatementSyntax
    ): NormalModeFactory = {
      val __obj = js.Dynamic.literal(argumentList = js.Any.fromFunction4(argumentList), arrayLiteralExpression = js.Any.fromFunction3(arrayLiteralExpression), arrayType = js.Any.fromFunction3(arrayType), binaryExpression = js.Any.fromFunction4(binaryExpression), block = js.Any.fromFunction3(block), breakStatement = js.Any.fromFunction3(breakStatement), callSignature = js.Any.fromFunction3(callSignature), caseSwitchClause = js.Any.fromFunction4(caseSwitchClause), castExpression = js.Any.fromFunction4(castExpression), catchClause = js.Any.fromFunction6(catchClause), classDeclaration = js.Any.fromFunction8(classDeclaration), conditionalExpression = js.Any.fromFunction5(conditionalExpression), constraint = js.Any.fromFunction2(constraint), constructSignature = js.Any.fromFunction2(constructSignature), constructorDeclaration = js.Any.fromFunction5(constructorDeclaration), constructorType = js.Any.fromFunction5(constructorType), continueStatement = js.Any.fromFunction3(continueStatement), debuggerStatement = js.Any.fromFunction2(debuggerStatement), defaultSwitchClause = js.Any.fromFunction3(defaultSwitchClause), deleteExpression = js.Any.fromFunction2(deleteExpression), doStatement = js.Any.fromFunction7(doStatement), elementAccessExpression = js.Any.fromFunction4(elementAccessExpression), elseClause = js.Any.fromFunction2(elseClause), emptyStatement = js.Any.fromFunction1(emptyStatement), enumDeclaration = js.Any.fromFunction6(enumDeclaration), enumElement = js.Any.fromFunction2(enumElement), equalsValueClause = js.Any.fromFunction2(equalsValueClause), exportAssignment = js.Any.fromFunction4(exportAssignment), expressionStatement = js.Any.fromFunction2(expressionStatement), externalModuleReference = js.Any.fromFunction4(externalModuleReference), finallyClause = js.Any.fromFunction2(finallyClause), forInStatement = js.Any.fromFunction8(forInStatement), forStatement = js.Any.fromFunction10(forStatement), functionDeclaration = js.Any.fromFunction6(functionDeclaration), functionExpression = js.Any.fromFunction4(functionExpression), functionPropertyAssignment = js.Any.fromFunction3(functionPropertyAssignment), functionType = js.Any.fromFunction4(functionType), genericType = js.Any.fromFunction2(genericType), getAccessor = js.Any.fromFunction6(getAccessor), heritageClause = js.Any.fromFunction3(heritageClause), ifStatement = js.Any.fromFunction6(ifStatement), importDeclaration = js.Any.fromFunction6(importDeclaration), indexMemberDeclaration = js.Any.fromFunction3(indexMemberDeclaration), indexSignature = js.Any.fromFunction4(indexSignature), interfaceDeclaration = js.Any.fromFunction6(interfaceDeclaration), invocationExpression = js.Any.fromFunction2(invocationExpression), labeledStatement = js.Any.fromFunction3(labeledStatement), memberAccessExpression = js.Any.fromFunction3(memberAccessExpression), memberFunctionDeclaration = js.Any.fromFunction5(memberFunctionDeclaration), memberVariableDeclaration = js.Any.fromFunction3(memberVariableDeclaration), methodSignature = js.Any.fromFunction3(methodSignature), moduleDeclaration = js.Any.fromFunction7(moduleDeclaration), moduleNameModuleReference = js.Any.fromFunction1(moduleNameModuleReference), objectCreationExpression = js.Any.fromFunction3(objectCreationExpression), objectLiteralExpression = js.Any.fromFunction3(objectLiteralExpression), objectType = js.Any.fromFunction3(objectType), omittedExpression = js.Any.fromFunction0(omittedExpression), parameter = js.Any.fromFunction6(parameter), parameterList = js.Any.fromFunction3(parameterList), parenthesizedArrowFunctionExpression = js.Any.fromFunction4(parenthesizedArrowFunctionExpression), parenthesizedExpression = js.Any.fromFunction3(parenthesizedExpression), postfixUnaryExpression = js.Any.fromFunction3(postfixUnaryExpression), prefixUnaryExpression = js.Any.fromFunction3(prefixUnaryExpression), propertySignature = js.Any.fromFunction3(propertySignature), qualifiedName = js.Any.fromFunction3(qualifiedName), returnStatement = js.Any.fromFunction3(returnStatement), setAccessor = js.Any.fromFunction5(setAccessor), simpleArrowFunctionExpression = js.Any.fromFunction4(simpleArrowFunctionExpression), simplePropertyAssignment = js.Any.fromFunction3(simplePropertyAssignment), sourceUnit = js.Any.fromFunction2(sourceUnit), switchStatement = js.Any.fromFunction7(switchStatement), throwStatement = js.Any.fromFunction3(throwStatement), tryStatement = js.Any.fromFunction4(tryStatement), typeAnnotation = js.Any.fromFunction2(typeAnnotation), typeArgumentList = js.Any.fromFunction3(typeArgumentList), typeOfExpression = js.Any.fromFunction2(typeOfExpression), typeParameter = js.Any.fromFunction2(typeParameter), typeParameterList = js.Any.fromFunction3(typeParameterList), typeQuery = js.Any.fromFunction2(typeQuery), variableDeclaration = js.Any.fromFunction2(variableDeclaration), variableDeclarator = js.Any.fromFunction3(variableDeclarator), variableStatement = js.Any.fromFunction3(variableStatement), voidExpression = js.Any.fromFunction2(voidExpression), whileStatement = js.Any.fromFunction5(whileStatement), withStatement = js.Any.fromFunction5(withStatement))
      __obj.asInstanceOf[NormalModeFactory]
    }
  }
  
  @js.native
  trait StrictModeFactory extends IFactory
  object StrictModeFactory {
    
    @scala.inline
    def apply(
      argumentList: (TypeArgumentListSyntax, ISyntaxToken, ISeparatedSyntaxList, ISyntaxToken) => ArgumentListSyntax,
      arrayLiteralExpression: (ISyntaxToken, ISeparatedSyntaxList, ISyntaxToken) => ArrayLiteralExpressionSyntax,
      arrayType: (ITypeSyntax, ISyntaxToken, ISyntaxToken) => ArrayTypeSyntax,
      binaryExpression: (SyntaxKind, IExpressionSyntax, ISyntaxToken, IExpressionSyntax) => BinaryExpressionSyntax,
      block: (ISyntaxToken, ISyntaxList, ISyntaxToken) => BlockSyntax,
      breakStatement: (ISyntaxToken, ISyntaxToken, ISyntaxToken) => BreakStatementSyntax,
      callSignature: (TypeParameterListSyntax, ParameterListSyntax, TypeAnnotationSyntax) => CallSignatureSyntax,
      caseSwitchClause: (ISyntaxToken, IExpressionSyntax, ISyntaxToken, ISyntaxList) => CaseSwitchClauseSyntax,
      castExpression: (ISyntaxToken, ITypeSyntax, ISyntaxToken, IUnaryExpressionSyntax) => CastExpressionSyntax,
      catchClause: (ISyntaxToken, ISyntaxToken, ISyntaxToken, TypeAnnotationSyntax, ISyntaxToken, BlockSyntax) => CatchClauseSyntax,
      classDeclaration: (ISyntaxList, ISyntaxToken, ISyntaxToken, TypeParameterListSyntax, ISyntaxList, ISyntaxToken, ISyntaxList, ISyntaxToken) => ClassDeclarationSyntax,
      conditionalExpression: (IExpressionSyntax, ISyntaxToken, IExpressionSyntax, ISyntaxToken, IExpressionSyntax) => ConditionalExpressionSyntax,
      constraint: (ISyntaxToken, ITypeSyntax) => ConstraintSyntax,
      constructSignature: (ISyntaxToken, CallSignatureSyntax) => ConstructSignatureSyntax,
      constructorDeclaration: (ISyntaxList, ISyntaxToken, CallSignatureSyntax, BlockSyntax, ISyntaxToken) => ConstructorDeclarationSyntax,
      constructorType: (ISyntaxToken, TypeParameterListSyntax, ParameterListSyntax, ISyntaxToken, ITypeSyntax) => ConstructorTypeSyntax,
      continueStatement: (ISyntaxToken, ISyntaxToken, ISyntaxToken) => ContinueStatementSyntax,
      debuggerStatement: (ISyntaxToken, ISyntaxToken) => DebuggerStatementSyntax,
      defaultSwitchClause: (ISyntaxToken, ISyntaxToken, ISyntaxList) => DefaultSwitchClauseSyntax,
      deleteExpression: (ISyntaxToken, IUnaryExpressionSyntax) => DeleteExpressionSyntax,
      doStatement: (ISyntaxToken, IStatementSyntax, ISyntaxToken, ISyntaxToken, IExpressionSyntax, ISyntaxToken, ISyntaxToken) => DoStatementSyntax,
      elementAccessExpression: (IExpressionSyntax, ISyntaxToken, IExpressionSyntax, ISyntaxToken) => ElementAccessExpressionSyntax,
      elseClause: (ISyntaxToken, IStatementSyntax) => ElseClauseSyntax,
      emptyStatement: ISyntaxToken => EmptyStatementSyntax,
      enumDeclaration: (ISyntaxList, ISyntaxToken, ISyntaxToken, ISyntaxToken, ISeparatedSyntaxList, ISyntaxToken) => EnumDeclarationSyntax,
      enumElement: (ISyntaxToken, EqualsValueClauseSyntax) => EnumElementSyntax,
      equalsValueClause: (ISyntaxToken, IExpressionSyntax) => EqualsValueClauseSyntax,
      exportAssignment: (ISyntaxToken, ISyntaxToken, ISyntaxToken, ISyntaxToken) => ExportAssignmentSyntax,
      expressionStatement: (IExpressionSyntax, ISyntaxToken) => ExpressionStatementSyntax,
      externalModuleReference: (ISyntaxToken, ISyntaxToken, ISyntaxToken, ISyntaxToken) => ExternalModuleReferenceSyntax,
      finallyClause: (ISyntaxToken, BlockSyntax) => FinallyClauseSyntax,
      forInStatement: (ISyntaxToken, ISyntaxToken, VariableDeclarationSyntax, IExpressionSyntax, ISyntaxToken, IExpressionSyntax, ISyntaxToken, IStatementSyntax) => ForInStatementSyntax,
      forStatement: (ISyntaxToken, ISyntaxToken, VariableDeclarationSyntax, IExpressionSyntax, ISyntaxToken, IExpressionSyntax, ISyntaxToken, IExpressionSyntax, ISyntaxToken, IStatementSyntax) => ForStatementSyntax,
      functionDeclaration: (ISyntaxList, ISyntaxToken, ISyntaxToken, CallSignatureSyntax, BlockSyntax, ISyntaxToken) => FunctionDeclarationSyntax,
      functionExpression: (ISyntaxToken, ISyntaxToken, CallSignatureSyntax, BlockSyntax) => FunctionExpressionSyntax,
      functionPropertyAssignment: (ISyntaxToken, CallSignatureSyntax, BlockSyntax) => FunctionPropertyAssignmentSyntax,
      functionType: (TypeParameterListSyntax, ParameterListSyntax, ISyntaxToken, ITypeSyntax) => FunctionTypeSyntax,
      genericType: (INameSyntax, TypeArgumentListSyntax) => GenericTypeSyntax,
      getAccessor: (ISyntaxList, ISyntaxToken, ISyntaxToken, ParameterListSyntax, TypeAnnotationSyntax, BlockSyntax) => GetAccessorSyntax,
      heritageClause: (SyntaxKind, ISyntaxToken, ISeparatedSyntaxList) => HeritageClauseSyntax,
      ifStatement: (ISyntaxToken, ISyntaxToken, IExpressionSyntax, ISyntaxToken, IStatementSyntax, ElseClauseSyntax) => IfStatementSyntax,
      importDeclaration: (ISyntaxList, ISyntaxToken, ISyntaxToken, ISyntaxToken, IModuleReferenceSyntax, ISyntaxToken) => ImportDeclarationSyntax,
      indexMemberDeclaration: (ISyntaxList, IndexSignatureSyntax, ISyntaxToken) => IndexMemberDeclarationSyntax,
      indexSignature: (ISyntaxToken, ParameterSyntax, ISyntaxToken, TypeAnnotationSyntax) => IndexSignatureSyntax,
      interfaceDeclaration: (ISyntaxList, ISyntaxToken, ISyntaxToken, TypeParameterListSyntax, ISyntaxList, ObjectTypeSyntax) => InterfaceDeclarationSyntax,
      invocationExpression: (IMemberExpressionSyntax, ArgumentListSyntax) => InvocationExpressionSyntax,
      labeledStatement: (ISyntaxToken, ISyntaxToken, IStatementSyntax) => LabeledStatementSyntax,
      memberAccessExpression: (IExpressionSyntax, ISyntaxToken, ISyntaxToken) => MemberAccessExpressionSyntax,
      memberFunctionDeclaration: (ISyntaxList, ISyntaxToken, CallSignatureSyntax, BlockSyntax, ISyntaxToken) => MemberFunctionDeclarationSyntax,
      memberVariableDeclaration: (ISyntaxList, VariableDeclaratorSyntax, ISyntaxToken) => MemberVariableDeclarationSyntax,
      methodSignature: (ISyntaxToken, ISyntaxToken, CallSignatureSyntax) => MethodSignatureSyntax,
      moduleDeclaration: (ISyntaxList, ISyntaxToken, INameSyntax, ISyntaxToken, ISyntaxToken, ISyntaxList, ISyntaxToken) => ModuleDeclarationSyntax,
      moduleNameModuleReference: INameSyntax => ModuleNameModuleReferenceSyntax,
      objectCreationExpression: (ISyntaxToken, IMemberExpressionSyntax, ArgumentListSyntax) => ObjectCreationExpressionSyntax,
      objectLiteralExpression: (ISyntaxToken, ISeparatedSyntaxList, ISyntaxToken) => ObjectLiteralExpressionSyntax,
      objectType: (ISyntaxToken, ISeparatedSyntaxList, ISyntaxToken) => ObjectTypeSyntax,
      omittedExpression: () => OmittedExpressionSyntax,
      parameter: (ISyntaxToken, ISyntaxList, ISyntaxToken, ISyntaxToken, TypeAnnotationSyntax, EqualsValueClauseSyntax) => ParameterSyntax,
      parameterList: (ISyntaxToken, ISeparatedSyntaxList, ISyntaxToken) => ParameterListSyntax,
      parenthesizedArrowFunctionExpression: (CallSignatureSyntax, ISyntaxToken, BlockSyntax, IExpressionSyntax) => ParenthesizedArrowFunctionExpressionSyntax,
      parenthesizedExpression: (ISyntaxToken, IExpressionSyntax, ISyntaxToken) => ParenthesizedExpressionSyntax,
      postfixUnaryExpression: (SyntaxKind, IMemberExpressionSyntax, ISyntaxToken) => PostfixUnaryExpressionSyntax,
      prefixUnaryExpression: (SyntaxKind, ISyntaxToken, IUnaryExpressionSyntax) => PrefixUnaryExpressionSyntax,
      propertySignature: (ISyntaxToken, ISyntaxToken, TypeAnnotationSyntax) => PropertySignatureSyntax,
      qualifiedName: (INameSyntax, ISyntaxToken, ISyntaxToken) => QualifiedNameSyntax,
      returnStatement: (ISyntaxToken, IExpressionSyntax, ISyntaxToken) => ReturnStatementSyntax,
      setAccessor: (ISyntaxList, ISyntaxToken, ISyntaxToken, ParameterListSyntax, BlockSyntax) => SetAccessorSyntax,
      simpleArrowFunctionExpression: (ISyntaxToken, ISyntaxToken, BlockSyntax, IExpressionSyntax) => SimpleArrowFunctionExpressionSyntax,
      simplePropertyAssignment: (ISyntaxToken, ISyntaxToken, IExpressionSyntax) => SimplePropertyAssignmentSyntax,
      sourceUnit: (ISyntaxList, ISyntaxToken) => SourceUnitSyntax,
      switchStatement: (ISyntaxToken, ISyntaxToken, IExpressionSyntax, ISyntaxToken, ISyntaxToken, ISyntaxList, ISyntaxToken) => SwitchStatementSyntax,
      throwStatement: (ISyntaxToken, IExpressionSyntax, ISyntaxToken) => ThrowStatementSyntax,
      tryStatement: (ISyntaxToken, BlockSyntax, CatchClauseSyntax, FinallyClauseSyntax) => TryStatementSyntax,
      typeAnnotation: (ISyntaxToken, ITypeSyntax) => TypeAnnotationSyntax,
      typeArgumentList: (ISyntaxToken, ISeparatedSyntaxList, ISyntaxToken) => TypeArgumentListSyntax,
      typeOfExpression: (ISyntaxToken, IUnaryExpressionSyntax) => TypeOfExpressionSyntax,
      typeParameter: (ISyntaxToken, ConstraintSyntax) => TypeParameterSyntax,
      typeParameterList: (ISyntaxToken, ISeparatedSyntaxList, ISyntaxToken) => TypeParameterListSyntax,
      typeQuery: (ISyntaxToken, INameSyntax) => TypeQuerySyntax,
      variableDeclaration: (ISyntaxToken, ISeparatedSyntaxList) => VariableDeclarationSyntax,
      variableDeclarator: (ISyntaxToken, TypeAnnotationSyntax, EqualsValueClauseSyntax) => VariableDeclaratorSyntax,
      variableStatement: (ISyntaxList, VariableDeclarationSyntax, ISyntaxToken) => VariableStatementSyntax,
      voidExpression: (ISyntaxToken, IUnaryExpressionSyntax) => VoidExpressionSyntax,
      whileStatement: (ISyntaxToken, ISyntaxToken, IExpressionSyntax, ISyntaxToken, IStatementSyntax) => WhileStatementSyntax,
      withStatement: (ISyntaxToken, ISyntaxToken, IExpressionSyntax, ISyntaxToken, IStatementSyntax) => WithStatementSyntax
    ): StrictModeFactory = {
      val __obj = js.Dynamic.literal(argumentList = js.Any.fromFunction4(argumentList), arrayLiteralExpression = js.Any.fromFunction3(arrayLiteralExpression), arrayType = js.Any.fromFunction3(arrayType), binaryExpression = js.Any.fromFunction4(binaryExpression), block = js.Any.fromFunction3(block), breakStatement = js.Any.fromFunction3(breakStatement), callSignature = js.Any.fromFunction3(callSignature), caseSwitchClause = js.Any.fromFunction4(caseSwitchClause), castExpression = js.Any.fromFunction4(castExpression), catchClause = js.Any.fromFunction6(catchClause), classDeclaration = js.Any.fromFunction8(classDeclaration), conditionalExpression = js.Any.fromFunction5(conditionalExpression), constraint = js.Any.fromFunction2(constraint), constructSignature = js.Any.fromFunction2(constructSignature), constructorDeclaration = js.Any.fromFunction5(constructorDeclaration), constructorType = js.Any.fromFunction5(constructorType), continueStatement = js.Any.fromFunction3(continueStatement), debuggerStatement = js.Any.fromFunction2(debuggerStatement), defaultSwitchClause = js.Any.fromFunction3(defaultSwitchClause), deleteExpression = js.Any.fromFunction2(deleteExpression), doStatement = js.Any.fromFunction7(doStatement), elementAccessExpression = js.Any.fromFunction4(elementAccessExpression), elseClause = js.Any.fromFunction2(elseClause), emptyStatement = js.Any.fromFunction1(emptyStatement), enumDeclaration = js.Any.fromFunction6(enumDeclaration), enumElement = js.Any.fromFunction2(enumElement), equalsValueClause = js.Any.fromFunction2(equalsValueClause), exportAssignment = js.Any.fromFunction4(exportAssignment), expressionStatement = js.Any.fromFunction2(expressionStatement), externalModuleReference = js.Any.fromFunction4(externalModuleReference), finallyClause = js.Any.fromFunction2(finallyClause), forInStatement = js.Any.fromFunction8(forInStatement), forStatement = js.Any.fromFunction10(forStatement), functionDeclaration = js.Any.fromFunction6(functionDeclaration), functionExpression = js.Any.fromFunction4(functionExpression), functionPropertyAssignment = js.Any.fromFunction3(functionPropertyAssignment), functionType = js.Any.fromFunction4(functionType), genericType = js.Any.fromFunction2(genericType), getAccessor = js.Any.fromFunction6(getAccessor), heritageClause = js.Any.fromFunction3(heritageClause), ifStatement = js.Any.fromFunction6(ifStatement), importDeclaration = js.Any.fromFunction6(importDeclaration), indexMemberDeclaration = js.Any.fromFunction3(indexMemberDeclaration), indexSignature = js.Any.fromFunction4(indexSignature), interfaceDeclaration = js.Any.fromFunction6(interfaceDeclaration), invocationExpression = js.Any.fromFunction2(invocationExpression), labeledStatement = js.Any.fromFunction3(labeledStatement), memberAccessExpression = js.Any.fromFunction3(memberAccessExpression), memberFunctionDeclaration = js.Any.fromFunction5(memberFunctionDeclaration), memberVariableDeclaration = js.Any.fromFunction3(memberVariableDeclaration), methodSignature = js.Any.fromFunction3(methodSignature), moduleDeclaration = js.Any.fromFunction7(moduleDeclaration), moduleNameModuleReference = js.Any.fromFunction1(moduleNameModuleReference), objectCreationExpression = js.Any.fromFunction3(objectCreationExpression), objectLiteralExpression = js.Any.fromFunction3(objectLiteralExpression), objectType = js.Any.fromFunction3(objectType), omittedExpression = js.Any.fromFunction0(omittedExpression), parameter = js.Any.fromFunction6(parameter), parameterList = js.Any.fromFunction3(parameterList), parenthesizedArrowFunctionExpression = js.Any.fromFunction4(parenthesizedArrowFunctionExpression), parenthesizedExpression = js.Any.fromFunction3(parenthesizedExpression), postfixUnaryExpression = js.Any.fromFunction3(postfixUnaryExpression), prefixUnaryExpression = js.Any.fromFunction3(prefixUnaryExpression), propertySignature = js.Any.fromFunction3(propertySignature), qualifiedName = js.Any.fromFunction3(qualifiedName), returnStatement = js.Any.fromFunction3(returnStatement), setAccessor = js.Any.fromFunction5(setAccessor), simpleArrowFunctionExpression = js.Any.fromFunction4(simpleArrowFunctionExpression), simplePropertyAssignment = js.Any.fromFunction3(simplePropertyAssignment), sourceUnit = js.Any.fromFunction2(sourceUnit), switchStatement = js.Any.fromFunction7(switchStatement), throwStatement = js.Any.fromFunction3(throwStatement), tryStatement = js.Any.fromFunction4(tryStatement), typeAnnotation = js.Any.fromFunction2(typeAnnotation), typeArgumentList = js.Any.fromFunction3(typeArgumentList), typeOfExpression = js.Any.fromFunction2(typeOfExpression), typeParameter = js.Any.fromFunction2(typeParameter), typeParameterList = js.Any.fromFunction3(typeParameterList), typeQuery = js.Any.fromFunction2(typeQuery), variableDeclaration = js.Any.fromFunction2(variableDeclaration), variableDeclarator = js.Any.fromFunction3(variableDeclarator), variableStatement = js.Any.fromFunction3(variableStatement), voidExpression = js.Any.fromFunction2(voidExpression), whileStatement = js.Any.fromFunction5(whileStatement), withStatement = js.Any.fromFunction5(withStatement))
      __obj.asInstanceOf[StrictModeFactory]
    }
  }
  
  @js.native
  trait VariableWidthTokenWithLeadingAndTrailingTrivia extends ISyntaxToken {
    
    var _fullText: js.Any = js.native
    
    var _leadingTriviaInfo: js.Any = js.native
    
    var _trailingTriviaInfo: js.Any = js.native
    
    /* private */ def findTokenInternal(parent: js.Any, position: js.Any, fullStart: js.Any): js.Any = js.native
    
    /* private */ def realize(): js.Any = js.native
    
    def toJSON(key: js.Any): js.Any = js.native
  }
  object VariableWidthTokenWithLeadingAndTrailingTrivia {
    
    @scala.inline
    def apply(
      _fullText: js.Any,
      _leadingTriviaInfo: js.Any,
      _trailingTriviaInfo: js.Any,
      accept: ISyntaxVisitor => js.Any,
      childAt: Double => ISyntaxElement,
      childCount: () => Double,
      collectTextElements: js.Array[String] => Unit,
      findTokenInternal: (js.Any, js.Any, js.Any) => js.Any,
      firstToken: () => ISyntaxToken,
      fullText: () => String,
      fullWidth: () => Double,
      hasLeadingComment: () => Boolean,
      hasLeadingNewLine: () => Boolean,
      hasLeadingSkippedText: () => Boolean,
      hasLeadingTrivia: () => Boolean,
      hasSkippedToken: () => Boolean,
      hasTrailingComment: () => Boolean,
      hasTrailingNewLine: () => Boolean,
      hasTrailingSkippedText: () => Boolean,
      hasTrailingTrivia: () => Boolean,
      isExpression: () => Boolean,
      isIncrementallyUnusable: () => Boolean,
      isList: () => Boolean,
      isMemberExpression: () => Boolean,
      isNode: () => Boolean,
      isPostfixExpression: () => Boolean,
      isPrimaryExpression: () => Boolean,
      isSeparatedList: () => Boolean,
      isToken: () => Boolean,
      isTypeScriptSpecific: () => Boolean,
      isUnaryExpression: () => Boolean,
      kind: () => SyntaxKind,
      lastToken: () => ISyntaxToken,
      leadingTrivia: () => ISyntaxTriviaList,
      leadingTriviaWidth: () => Double,
      realize: () => js.Any,
      text: () => String,
      toJSON: js.Any => js.Any,
      tokenKind: SyntaxKind,
      trailingTrivia: () => ISyntaxTriviaList,
      trailingTriviaWidth: () => Double,
      value: () => js.Any,
      valueText: () => String,
      width: () => Double,
      withLeadingTrivia: ISyntaxTriviaList => ISyntaxNodeOrToken,
      withTrailingTrivia: ISyntaxTriviaList => ISyntaxNodeOrToken
    ): VariableWidthTokenWithLeadingAndTrailingTrivia = {
      val __obj = js.Dynamic.literal(_fullText = _fullText.asInstanceOf[js.Any], _leadingTriviaInfo = _leadingTriviaInfo.asInstanceOf[js.Any], _trailingTriviaInfo = _trailingTriviaInfo.asInstanceOf[js.Any], accept = js.Any.fromFunction1(accept), childAt = js.Any.fromFunction1(childAt), childCount = js.Any.fromFunction0(childCount), collectTextElements = js.Any.fromFunction1(collectTextElements), findTokenInternal = js.Any.fromFunction3(findTokenInternal), firstToken = js.Any.fromFunction0(firstToken), fullText = js.Any.fromFunction0(fullText), fullWidth = js.Any.fromFunction0(fullWidth), hasLeadingComment = js.Any.fromFunction0(hasLeadingComment), hasLeadingNewLine = js.Any.fromFunction0(hasLeadingNewLine), hasLeadingSkippedText = js.Any.fromFunction0(hasLeadingSkippedText), hasLeadingTrivia = js.Any.fromFunction0(hasLeadingTrivia), hasSkippedToken = js.Any.fromFunction0(hasSkippedToken), hasTrailingComment = js.Any.fromFunction0(hasTrailingComment), hasTrailingNewLine = js.Any.fromFunction0(hasTrailingNewLine), hasTrailingSkippedText = js.Any.fromFunction0(hasTrailingSkippedText), hasTrailingTrivia = js.Any.fromFunction0(hasTrailingTrivia), isExpression = js.Any.fromFunction0(isExpression), isIncrementallyUnusable = js.Any.fromFunction0(isIncrementallyUnusable), isList = js.Any.fromFunction0(isList), isMemberExpression = js.Any.fromFunction0(isMemberExpression), isNode = js.Any.fromFunction0(isNode), isPostfixExpression = js.Any.fromFunction0(isPostfixExpression), isPrimaryExpression = js.Any.fromFunction0(isPrimaryExpression), isSeparatedList = js.Any.fromFunction0(isSeparatedList), isToken = js.Any.fromFunction0(isToken), isTypeScriptSpecific = js.Any.fromFunction0(isTypeScriptSpecific), isUnaryExpression = js.Any.fromFunction0(isUnaryExpression), kind = js.Any.fromFunction0(kind), lastToken = js.Any.fromFunction0(lastToken), leadingTrivia = js.Any.fromFunction0(leadingTrivia), leadingTriviaWidth = js.Any.fromFunction0(leadingTriviaWidth), realize = js.Any.fromFunction0(realize), text = js.Any.fromFunction0(text), toJSON = js.Any.fromFunction1(toJSON), tokenKind = tokenKind.asInstanceOf[js.Any], trailingTrivia = js.Any.fromFunction0(trailingTrivia), trailingTriviaWidth = js.Any.fromFunction0(trailingTriviaWidth), value = js.Any.fromFunction0(value), valueText = js.Any.fromFunction0(valueText), width = js.Any.fromFunction0(width), withLeadingTrivia = js.Any.fromFunction1(withLeadingTrivia), withTrailingTrivia = js.Any.fromFunction1(withTrailingTrivia))
      __obj.asInstanceOf[VariableWidthTokenWithLeadingAndTrailingTrivia]
    }
    
    @scala.inline
    implicit class VariableWidthTokenWithLeadingAndTrailingTriviaMutableBuilder[Self <: VariableWidthTokenWithLeadingAndTrailingTrivia] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFindTokenInternal(value: (js.Any, js.Any, js.Any) => js.Any): Self = StObject.set(x, "findTokenInternal", js.Any.fromFunction3(value))
      
      @scala.inline
      def setRealize(value: () => js.Any): Self = StObject.set(x, "realize", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToJSON(value: js.Any => js.Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction1(value))
      
      @scala.inline
      def set_fullText(value: js.Any): Self = StObject.set(x, "_fullText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_leadingTriviaInfo(value: js.Any): Self = StObject.set(x, "_leadingTriviaInfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_trailingTriviaInfo(value: js.Any): Self = StObject.set(x, "_trailingTriviaInfo", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait VariableWidthTokenWithLeadingTrivia extends ISyntaxToken {
    
    var _fullText: js.Any = js.native
    
    var _leadingTriviaInfo: js.Any = js.native
    
    /* private */ def findTokenInternal(parent: js.Any, position: js.Any, fullStart: js.Any): js.Any = js.native
    
    /* private */ def realize(): js.Any = js.native
    
    def toJSON(key: js.Any): js.Any = js.native
  }
  object VariableWidthTokenWithLeadingTrivia {
    
    @scala.inline
    def apply(
      _fullText: js.Any,
      _leadingTriviaInfo: js.Any,
      accept: ISyntaxVisitor => js.Any,
      childAt: Double => ISyntaxElement,
      childCount: () => Double,
      collectTextElements: js.Array[String] => Unit,
      findTokenInternal: (js.Any, js.Any, js.Any) => js.Any,
      firstToken: () => ISyntaxToken,
      fullText: () => String,
      fullWidth: () => Double,
      hasLeadingComment: () => Boolean,
      hasLeadingNewLine: () => Boolean,
      hasLeadingSkippedText: () => Boolean,
      hasLeadingTrivia: () => Boolean,
      hasSkippedToken: () => Boolean,
      hasTrailingComment: () => Boolean,
      hasTrailingNewLine: () => Boolean,
      hasTrailingSkippedText: () => Boolean,
      hasTrailingTrivia: () => Boolean,
      isExpression: () => Boolean,
      isIncrementallyUnusable: () => Boolean,
      isList: () => Boolean,
      isMemberExpression: () => Boolean,
      isNode: () => Boolean,
      isPostfixExpression: () => Boolean,
      isPrimaryExpression: () => Boolean,
      isSeparatedList: () => Boolean,
      isToken: () => Boolean,
      isTypeScriptSpecific: () => Boolean,
      isUnaryExpression: () => Boolean,
      kind: () => SyntaxKind,
      lastToken: () => ISyntaxToken,
      leadingTrivia: () => ISyntaxTriviaList,
      leadingTriviaWidth: () => Double,
      realize: () => js.Any,
      text: () => String,
      toJSON: js.Any => js.Any,
      tokenKind: SyntaxKind,
      trailingTrivia: () => ISyntaxTriviaList,
      trailingTriviaWidth: () => Double,
      value: () => js.Any,
      valueText: () => String,
      width: () => Double,
      withLeadingTrivia: ISyntaxTriviaList => ISyntaxNodeOrToken,
      withTrailingTrivia: ISyntaxTriviaList => ISyntaxNodeOrToken
    ): VariableWidthTokenWithLeadingTrivia = {
      val __obj = js.Dynamic.literal(_fullText = _fullText.asInstanceOf[js.Any], _leadingTriviaInfo = _leadingTriviaInfo.asInstanceOf[js.Any], accept = js.Any.fromFunction1(accept), childAt = js.Any.fromFunction1(childAt), childCount = js.Any.fromFunction0(childCount), collectTextElements = js.Any.fromFunction1(collectTextElements), findTokenInternal = js.Any.fromFunction3(findTokenInternal), firstToken = js.Any.fromFunction0(firstToken), fullText = js.Any.fromFunction0(fullText), fullWidth = js.Any.fromFunction0(fullWidth), hasLeadingComment = js.Any.fromFunction0(hasLeadingComment), hasLeadingNewLine = js.Any.fromFunction0(hasLeadingNewLine), hasLeadingSkippedText = js.Any.fromFunction0(hasLeadingSkippedText), hasLeadingTrivia = js.Any.fromFunction0(hasLeadingTrivia), hasSkippedToken = js.Any.fromFunction0(hasSkippedToken), hasTrailingComment = js.Any.fromFunction0(hasTrailingComment), hasTrailingNewLine = js.Any.fromFunction0(hasTrailingNewLine), hasTrailingSkippedText = js.Any.fromFunction0(hasTrailingSkippedText), hasTrailingTrivia = js.Any.fromFunction0(hasTrailingTrivia), isExpression = js.Any.fromFunction0(isExpression), isIncrementallyUnusable = js.Any.fromFunction0(isIncrementallyUnusable), isList = js.Any.fromFunction0(isList), isMemberExpression = js.Any.fromFunction0(isMemberExpression), isNode = js.Any.fromFunction0(isNode), isPostfixExpression = js.Any.fromFunction0(isPostfixExpression), isPrimaryExpression = js.Any.fromFunction0(isPrimaryExpression), isSeparatedList = js.Any.fromFunction0(isSeparatedList), isToken = js.Any.fromFunction0(isToken), isTypeScriptSpecific = js.Any.fromFunction0(isTypeScriptSpecific), isUnaryExpression = js.Any.fromFunction0(isUnaryExpression), kind = js.Any.fromFunction0(kind), lastToken = js.Any.fromFunction0(lastToken), leadingTrivia = js.Any.fromFunction0(leadingTrivia), leadingTriviaWidth = js.Any.fromFunction0(leadingTriviaWidth), realize = js.Any.fromFunction0(realize), text = js.Any.fromFunction0(text), toJSON = js.Any.fromFunction1(toJSON), tokenKind = tokenKind.asInstanceOf[js.Any], trailingTrivia = js.Any.fromFunction0(trailingTrivia), trailingTriviaWidth = js.Any.fromFunction0(trailingTriviaWidth), value = js.Any.fromFunction0(value), valueText = js.Any.fromFunction0(valueText), width = js.Any.fromFunction0(width), withLeadingTrivia = js.Any.fromFunction1(withLeadingTrivia), withTrailingTrivia = js.Any.fromFunction1(withTrailingTrivia))
      __obj.asInstanceOf[VariableWidthTokenWithLeadingTrivia]
    }
    
    @scala.inline
    implicit class VariableWidthTokenWithLeadingTriviaMutableBuilder[Self <: VariableWidthTokenWithLeadingTrivia] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFindTokenInternal(value: (js.Any, js.Any, js.Any) => js.Any): Self = StObject.set(x, "findTokenInternal", js.Any.fromFunction3(value))
      
      @scala.inline
      def setRealize(value: () => js.Any): Self = StObject.set(x, "realize", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToJSON(value: js.Any => js.Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction1(value))
      
      @scala.inline
      def set_fullText(value: js.Any): Self = StObject.set(x, "_fullText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_leadingTriviaInfo(value: js.Any): Self = StObject.set(x, "_leadingTriviaInfo", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait VariableWidthTokenWithNoTrivia extends ISyntaxToken {
    
    var _fullText: js.Any = js.native
    
    /* private */ def findTokenInternal(parent: js.Any, position: js.Any, fullStart: js.Any): js.Any = js.native
    
    /* private */ def realize(): js.Any = js.native
    
    def toJSON(key: js.Any): js.Any = js.native
  }
  object VariableWidthTokenWithNoTrivia {
    
    @scala.inline
    def apply(
      _fullText: js.Any,
      accept: ISyntaxVisitor => js.Any,
      childAt: Double => ISyntaxElement,
      childCount: () => Double,
      collectTextElements: js.Array[String] => Unit,
      findTokenInternal: (js.Any, js.Any, js.Any) => js.Any,
      firstToken: () => ISyntaxToken,
      fullText: () => String,
      fullWidth: () => Double,
      hasLeadingComment: () => Boolean,
      hasLeadingNewLine: () => Boolean,
      hasLeadingSkippedText: () => Boolean,
      hasLeadingTrivia: () => Boolean,
      hasSkippedToken: () => Boolean,
      hasTrailingComment: () => Boolean,
      hasTrailingNewLine: () => Boolean,
      hasTrailingSkippedText: () => Boolean,
      hasTrailingTrivia: () => Boolean,
      isExpression: () => Boolean,
      isIncrementallyUnusable: () => Boolean,
      isList: () => Boolean,
      isMemberExpression: () => Boolean,
      isNode: () => Boolean,
      isPostfixExpression: () => Boolean,
      isPrimaryExpression: () => Boolean,
      isSeparatedList: () => Boolean,
      isToken: () => Boolean,
      isTypeScriptSpecific: () => Boolean,
      isUnaryExpression: () => Boolean,
      kind: () => SyntaxKind,
      lastToken: () => ISyntaxToken,
      leadingTrivia: () => ISyntaxTriviaList,
      leadingTriviaWidth: () => Double,
      realize: () => js.Any,
      text: () => String,
      toJSON: js.Any => js.Any,
      tokenKind: SyntaxKind,
      trailingTrivia: () => ISyntaxTriviaList,
      trailingTriviaWidth: () => Double,
      value: () => js.Any,
      valueText: () => String,
      width: () => Double,
      withLeadingTrivia: ISyntaxTriviaList => ISyntaxNodeOrToken,
      withTrailingTrivia: ISyntaxTriviaList => ISyntaxNodeOrToken
    ): VariableWidthTokenWithNoTrivia = {
      val __obj = js.Dynamic.literal(_fullText = _fullText.asInstanceOf[js.Any], accept = js.Any.fromFunction1(accept), childAt = js.Any.fromFunction1(childAt), childCount = js.Any.fromFunction0(childCount), collectTextElements = js.Any.fromFunction1(collectTextElements), findTokenInternal = js.Any.fromFunction3(findTokenInternal), firstToken = js.Any.fromFunction0(firstToken), fullText = js.Any.fromFunction0(fullText), fullWidth = js.Any.fromFunction0(fullWidth), hasLeadingComment = js.Any.fromFunction0(hasLeadingComment), hasLeadingNewLine = js.Any.fromFunction0(hasLeadingNewLine), hasLeadingSkippedText = js.Any.fromFunction0(hasLeadingSkippedText), hasLeadingTrivia = js.Any.fromFunction0(hasLeadingTrivia), hasSkippedToken = js.Any.fromFunction0(hasSkippedToken), hasTrailingComment = js.Any.fromFunction0(hasTrailingComment), hasTrailingNewLine = js.Any.fromFunction0(hasTrailingNewLine), hasTrailingSkippedText = js.Any.fromFunction0(hasTrailingSkippedText), hasTrailingTrivia = js.Any.fromFunction0(hasTrailingTrivia), isExpression = js.Any.fromFunction0(isExpression), isIncrementallyUnusable = js.Any.fromFunction0(isIncrementallyUnusable), isList = js.Any.fromFunction0(isList), isMemberExpression = js.Any.fromFunction0(isMemberExpression), isNode = js.Any.fromFunction0(isNode), isPostfixExpression = js.Any.fromFunction0(isPostfixExpression), isPrimaryExpression = js.Any.fromFunction0(isPrimaryExpression), isSeparatedList = js.Any.fromFunction0(isSeparatedList), isToken = js.Any.fromFunction0(isToken), isTypeScriptSpecific = js.Any.fromFunction0(isTypeScriptSpecific), isUnaryExpression = js.Any.fromFunction0(isUnaryExpression), kind = js.Any.fromFunction0(kind), lastToken = js.Any.fromFunction0(lastToken), leadingTrivia = js.Any.fromFunction0(leadingTrivia), leadingTriviaWidth = js.Any.fromFunction0(leadingTriviaWidth), realize = js.Any.fromFunction0(realize), text = js.Any.fromFunction0(text), toJSON = js.Any.fromFunction1(toJSON), tokenKind = tokenKind.asInstanceOf[js.Any], trailingTrivia = js.Any.fromFunction0(trailingTrivia), trailingTriviaWidth = js.Any.fromFunction0(trailingTriviaWidth), value = js.Any.fromFunction0(value), valueText = js.Any.fromFunction0(valueText), width = js.Any.fromFunction0(width), withLeadingTrivia = js.Any.fromFunction1(withLeadingTrivia), withTrailingTrivia = js.Any.fromFunction1(withTrailingTrivia))
      __obj.asInstanceOf[VariableWidthTokenWithNoTrivia]
    }
    
    @scala.inline
    implicit class VariableWidthTokenWithNoTriviaMutableBuilder[Self <: VariableWidthTokenWithNoTrivia] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFindTokenInternal(value: (js.Any, js.Any, js.Any) => js.Any): Self = StObject.set(x, "findTokenInternal", js.Any.fromFunction3(value))
      
      @scala.inline
      def setRealize(value: () => js.Any): Self = StObject.set(x, "realize", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToJSON(value: js.Any => js.Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction1(value))
      
      @scala.inline
      def set_fullText(value: js.Any): Self = StObject.set(x, "_fullText", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait VariableWidthTokenWithTrailingTrivia extends ISyntaxToken {
    
    var _fullText: js.Any = js.native
    
    var _trailingTriviaInfo: js.Any = js.native
    
    /* private */ def findTokenInternal(parent: js.Any, position: js.Any, fullStart: js.Any): js.Any = js.native
    
    /* private */ def realize(): js.Any = js.native
    
    def toJSON(key: js.Any): js.Any = js.native
  }
  object VariableWidthTokenWithTrailingTrivia {
    
    @scala.inline
    def apply(
      _fullText: js.Any,
      _trailingTriviaInfo: js.Any,
      accept: ISyntaxVisitor => js.Any,
      childAt: Double => ISyntaxElement,
      childCount: () => Double,
      collectTextElements: js.Array[String] => Unit,
      findTokenInternal: (js.Any, js.Any, js.Any) => js.Any,
      firstToken: () => ISyntaxToken,
      fullText: () => String,
      fullWidth: () => Double,
      hasLeadingComment: () => Boolean,
      hasLeadingNewLine: () => Boolean,
      hasLeadingSkippedText: () => Boolean,
      hasLeadingTrivia: () => Boolean,
      hasSkippedToken: () => Boolean,
      hasTrailingComment: () => Boolean,
      hasTrailingNewLine: () => Boolean,
      hasTrailingSkippedText: () => Boolean,
      hasTrailingTrivia: () => Boolean,
      isExpression: () => Boolean,
      isIncrementallyUnusable: () => Boolean,
      isList: () => Boolean,
      isMemberExpression: () => Boolean,
      isNode: () => Boolean,
      isPostfixExpression: () => Boolean,
      isPrimaryExpression: () => Boolean,
      isSeparatedList: () => Boolean,
      isToken: () => Boolean,
      isTypeScriptSpecific: () => Boolean,
      isUnaryExpression: () => Boolean,
      kind: () => SyntaxKind,
      lastToken: () => ISyntaxToken,
      leadingTrivia: () => ISyntaxTriviaList,
      leadingTriviaWidth: () => Double,
      realize: () => js.Any,
      text: () => String,
      toJSON: js.Any => js.Any,
      tokenKind: SyntaxKind,
      trailingTrivia: () => ISyntaxTriviaList,
      trailingTriviaWidth: () => Double,
      value: () => js.Any,
      valueText: () => String,
      width: () => Double,
      withLeadingTrivia: ISyntaxTriviaList => ISyntaxNodeOrToken,
      withTrailingTrivia: ISyntaxTriviaList => ISyntaxNodeOrToken
    ): VariableWidthTokenWithTrailingTrivia = {
      val __obj = js.Dynamic.literal(_fullText = _fullText.asInstanceOf[js.Any], _trailingTriviaInfo = _trailingTriviaInfo.asInstanceOf[js.Any], accept = js.Any.fromFunction1(accept), childAt = js.Any.fromFunction1(childAt), childCount = js.Any.fromFunction0(childCount), collectTextElements = js.Any.fromFunction1(collectTextElements), findTokenInternal = js.Any.fromFunction3(findTokenInternal), firstToken = js.Any.fromFunction0(firstToken), fullText = js.Any.fromFunction0(fullText), fullWidth = js.Any.fromFunction0(fullWidth), hasLeadingComment = js.Any.fromFunction0(hasLeadingComment), hasLeadingNewLine = js.Any.fromFunction0(hasLeadingNewLine), hasLeadingSkippedText = js.Any.fromFunction0(hasLeadingSkippedText), hasLeadingTrivia = js.Any.fromFunction0(hasLeadingTrivia), hasSkippedToken = js.Any.fromFunction0(hasSkippedToken), hasTrailingComment = js.Any.fromFunction0(hasTrailingComment), hasTrailingNewLine = js.Any.fromFunction0(hasTrailingNewLine), hasTrailingSkippedText = js.Any.fromFunction0(hasTrailingSkippedText), hasTrailingTrivia = js.Any.fromFunction0(hasTrailingTrivia), isExpression = js.Any.fromFunction0(isExpression), isIncrementallyUnusable = js.Any.fromFunction0(isIncrementallyUnusable), isList = js.Any.fromFunction0(isList), isMemberExpression = js.Any.fromFunction0(isMemberExpression), isNode = js.Any.fromFunction0(isNode), isPostfixExpression = js.Any.fromFunction0(isPostfixExpression), isPrimaryExpression = js.Any.fromFunction0(isPrimaryExpression), isSeparatedList = js.Any.fromFunction0(isSeparatedList), isToken = js.Any.fromFunction0(isToken), isTypeScriptSpecific = js.Any.fromFunction0(isTypeScriptSpecific), isUnaryExpression = js.Any.fromFunction0(isUnaryExpression), kind = js.Any.fromFunction0(kind), lastToken = js.Any.fromFunction0(lastToken), leadingTrivia = js.Any.fromFunction0(leadingTrivia), leadingTriviaWidth = js.Any.fromFunction0(leadingTriviaWidth), realize = js.Any.fromFunction0(realize), text = js.Any.fromFunction0(text), toJSON = js.Any.fromFunction1(toJSON), tokenKind = tokenKind.asInstanceOf[js.Any], trailingTrivia = js.Any.fromFunction0(trailingTrivia), trailingTriviaWidth = js.Any.fromFunction0(trailingTriviaWidth), value = js.Any.fromFunction0(value), valueText = js.Any.fromFunction0(valueText), width = js.Any.fromFunction0(width), withLeadingTrivia = js.Any.fromFunction1(withLeadingTrivia), withTrailingTrivia = js.Any.fromFunction1(withTrailingTrivia))
      __obj.asInstanceOf[VariableWidthTokenWithTrailingTrivia]
    }
    
    @scala.inline
    implicit class VariableWidthTokenWithTrailingTriviaMutableBuilder[Self <: VariableWidthTokenWithTrailingTrivia] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFindTokenInternal(value: (js.Any, js.Any, js.Any) => js.Any): Self = StObject.set(x, "findTokenInternal", js.Any.fromFunction3(value))
      
      @scala.inline
      def setRealize(value: () => js.Any): Self = StObject.set(x, "realize", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToJSON(value: js.Any => js.Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction1(value))
      
      @scala.inline
      def set_fullText(value: js.Any): Self = StObject.set(x, "_fullText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_trailingTriviaInfo(value: js.Any): Self = StObject.set(x, "_trailingTriviaInfo", value.asInstanceOf[js.Any])
    }
  }
}
