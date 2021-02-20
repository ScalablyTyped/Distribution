package typings.vsoNodeApi

import typings.std.Date
import typings.vsoNodeApi.anon.EnumValuesHourly
import typings.vsoNodeApi.anon.EnumValuesPreliminary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object projectAnalysisInterfacesMod {
  
  @js.native
  sealed trait AggregationType extends StObject
  @JSImport("vso-node-api/interfaces/ProjectAnalysisInterfaces", "AggregationType")
  @js.native
  object AggregationType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[AggregationType with Double] = js.native
    
    @js.native
    sealed trait Daily extends AggregationType
    /* 1 */ val Daily: typings.vsoNodeApi.projectAnalysisInterfacesMod.AggregationType.Daily with Double = js.native
    
    @js.native
    sealed trait Hourly extends AggregationType
    /* 0 */ val Hourly: typings.vsoNodeApi.projectAnalysisInterfacesMod.AggregationType.Hourly with Double = js.native
  }
  
  @js.native
  sealed trait ResultPhase extends StObject
  @JSImport("vso-node-api/interfaces/ProjectAnalysisInterfaces", "ResultPhase")
  @js.native
  object ResultPhase extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ResultPhase with Double] = js.native
    
    @js.native
    sealed trait Full extends ResultPhase
    /* 1 */ val Full: typings.vsoNodeApi.projectAnalysisInterfacesMod.ResultPhase.Full with Double = js.native
    
    @js.native
    sealed trait Preliminary extends ResultPhase
    /* 0 */ val Preliminary: typings.vsoNodeApi.projectAnalysisInterfacesMod.ResultPhase.Preliminary with Double = js.native
  }
  
  object TypeInfo {
    
    @JSImport("vso-node-api/interfaces/ProjectAnalysisInterfaces", "TypeInfo")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("vso-node-api/interfaces/ProjectAnalysisInterfaces", "TypeInfo.AggregationType")
    @js.native
    def AggregationType: EnumValuesHourly = js.native
    @scala.inline
    def AggregationType_=(x: EnumValuesHourly): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AggregationType")(x.asInstanceOf[js.Any])
    
    @JSImport("vso-node-api/interfaces/ProjectAnalysisInterfaces", "TypeInfo.CodeChangeTrendItem")
    @js.native
    def CodeChangeTrendItem: js.Any = js.native
    @scala.inline
    def CodeChangeTrendItem_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CodeChangeTrendItem")(x.asInstanceOf[js.Any])
    
    @JSImport("vso-node-api/interfaces/ProjectAnalysisInterfaces", "TypeInfo.ProjectActivityMetrics")
    @js.native
    def ProjectActivityMetrics: js.Any = js.native
    @scala.inline
    def ProjectActivityMetrics_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ProjectActivityMetrics")(x.asInstanceOf[js.Any])
    
    @JSImport("vso-node-api/interfaces/ProjectAnalysisInterfaces", "TypeInfo.ProjectLanguageAnalytics")
    @js.native
    def ProjectLanguageAnalytics: js.Any = js.native
    @scala.inline
    def ProjectLanguageAnalytics_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ProjectLanguageAnalytics")(x.asInstanceOf[js.Any])
    
    @JSImport("vso-node-api/interfaces/ProjectAnalysisInterfaces", "TypeInfo.RepositoryActivityMetrics")
    @js.native
    def RepositoryActivityMetrics: js.Any = js.native
    @scala.inline
    def RepositoryActivityMetrics_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RepositoryActivityMetrics")(x.asInstanceOf[js.Any])
    
    @JSImport("vso-node-api/interfaces/ProjectAnalysisInterfaces", "TypeInfo.RepositoryLanguageAnalytics")
    @js.native
    def RepositoryLanguageAnalytics: js.Any = js.native
    @scala.inline
    def RepositoryLanguageAnalytics_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RepositoryLanguageAnalytics")(x.asInstanceOf[js.Any])
    
    @JSImport("vso-node-api/interfaces/ProjectAnalysisInterfaces", "TypeInfo.ResultPhase")
    @js.native
    def ResultPhase: EnumValuesPreliminary = js.native
    @scala.inline
    def ResultPhase_=(x: EnumValuesPreliminary): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ResultPhase")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait AnalyzerDescriptor extends StObject {
    
    var description: String = js.native
    
    var id: String = js.native
    
    var majorVersion: Double = js.native
    
    var minorVersion: Double = js.native
    
    var name: String = js.native
    
    var patchVersion: Double = js.native
  }
  object AnalyzerDescriptor {
    
    @scala.inline
    def apply(
      description: String,
      id: String,
      majorVersion: Double,
      minorVersion: Double,
      name: String,
      patchVersion: Double
    ): AnalyzerDescriptor = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], majorVersion = majorVersion.asInstanceOf[js.Any], minorVersion = minorVersion.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], patchVersion = patchVersion.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnalyzerDescriptor]
    }
    
    @scala.inline
    implicit class AnalyzerDescriptorMutableBuilder[Self <: AnalyzerDescriptor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMajorVersion(value: Double): Self = StObject.set(x, "majorVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinorVersion(value: Double): Self = StObject.set(x, "minorVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPatchVersion(value: Double): Self = StObject.set(x, "patchVersion", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CodeChangeTrendItem extends StObject {
    
    var time: Date = js.native
    
    var value: Double = js.native
  }
  object CodeChangeTrendItem {
    
    @scala.inline
    def apply(time: Date, value: Double): CodeChangeTrendItem = {
      val __obj = js.Dynamic.literal(time = time.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[CodeChangeTrendItem]
    }
    
    @scala.inline
    implicit class CodeChangeTrendItemMutableBuilder[Self <: CodeChangeTrendItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTime(value: Date): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait LanguageStatistics extends StObject {
    
    var bytes: Double = js.native
    
    var files: Double = js.native
    
    var filesPercentage: Double = js.native
    
    var languagePercentage: Double = js.native
    
    var name: String = js.native
  }
  object LanguageStatistics {
    
    @scala.inline
    def apply(bytes: Double, files: Double, filesPercentage: Double, languagePercentage: Double, name: String): LanguageStatistics = {
      val __obj = js.Dynamic.literal(bytes = bytes.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any], filesPercentage = filesPercentage.asInstanceOf[js.Any], languagePercentage = languagePercentage.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[LanguageStatistics]
    }
    
    @scala.inline
    implicit class LanguageStatisticsMutableBuilder[Self <: LanguageStatistics] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBytes(value: Double): Self = StObject.set(x, "bytes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiles(value: Double): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilesPercentage(value: Double): Self = StObject.set(x, "filesPercentage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLanguagePercentage(value: Double): Self = StObject.set(x, "languagePercentage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ProjectActivityMetrics extends StObject {
    
    var authorsCount: Double = js.native
    
    var codeChangesCount: Double = js.native
    
    var codeChangesTrend: js.Array[CodeChangeTrendItem] = js.native
    
    var projectId: String = js.native
    
    var pullRequestsCompletedCount: Double = js.native
    
    var pullRequestsCreatedCount: Double = js.native
  }
  object ProjectActivityMetrics {
    
    @scala.inline
    def apply(
      authorsCount: Double,
      codeChangesCount: Double,
      codeChangesTrend: js.Array[CodeChangeTrendItem],
      projectId: String,
      pullRequestsCompletedCount: Double,
      pullRequestsCreatedCount: Double
    ): ProjectActivityMetrics = {
      val __obj = js.Dynamic.literal(authorsCount = authorsCount.asInstanceOf[js.Any], codeChangesCount = codeChangesCount.asInstanceOf[js.Any], codeChangesTrend = codeChangesTrend.asInstanceOf[js.Any], projectId = projectId.asInstanceOf[js.Any], pullRequestsCompletedCount = pullRequestsCompletedCount.asInstanceOf[js.Any], pullRequestsCreatedCount = pullRequestsCreatedCount.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProjectActivityMetrics]
    }
    
    @scala.inline
    implicit class ProjectActivityMetricsMutableBuilder[Self <: ProjectActivityMetrics] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthorsCount(value: Double): Self = StObject.set(x, "authorsCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodeChangesCount(value: Double): Self = StObject.set(x, "codeChangesCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodeChangesTrend(value: js.Array[CodeChangeTrendItem]): Self = StObject.set(x, "codeChangesTrend", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodeChangesTrendVarargs(value: CodeChangeTrendItem*): Self = StObject.set(x, "codeChangesTrend", js.Array(value :_*))
      
      @scala.inline
      def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPullRequestsCompletedCount(value: Double): Self = StObject.set(x, "pullRequestsCompletedCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPullRequestsCreatedCount(value: Double): Self = StObject.set(x, "pullRequestsCreatedCount", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ProjectLanguageAnalytics extends StObject {
    
    var id: String = js.native
    
    var languageBreakdown: js.Array[LanguageStatistics] = js.native
    
    var repositoryLanguageAnalytics: js.Array[RepositoryLanguageAnalytics] = js.native
    
    var resultPhase: ResultPhase = js.native
    
    var url: String = js.native
  }
  object ProjectLanguageAnalytics {
    
    @scala.inline
    def apply(
      id: String,
      languageBreakdown: js.Array[LanguageStatistics],
      repositoryLanguageAnalytics: js.Array[RepositoryLanguageAnalytics],
      resultPhase: ResultPhase,
      url: String
    ): ProjectLanguageAnalytics = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], languageBreakdown = languageBreakdown.asInstanceOf[js.Any], repositoryLanguageAnalytics = repositoryLanguageAnalytics.asInstanceOf[js.Any], resultPhase = resultPhase.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProjectLanguageAnalytics]
    }
    
    @scala.inline
    implicit class ProjectLanguageAnalyticsMutableBuilder[Self <: ProjectLanguageAnalytics] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLanguageBreakdown(value: js.Array[LanguageStatistics]): Self = StObject.set(x, "languageBreakdown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLanguageBreakdownVarargs(value: LanguageStatistics*): Self = StObject.set(x, "languageBreakdown", js.Array(value :_*))
      
      @scala.inline
      def setRepositoryLanguageAnalytics(value: js.Array[RepositoryLanguageAnalytics]): Self = StObject.set(x, "repositoryLanguageAnalytics", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepositoryLanguageAnalyticsVarargs(value: RepositoryLanguageAnalytics*): Self = StObject.set(x, "repositoryLanguageAnalytics", js.Array(value :_*))
      
      @scala.inline
      def setResultPhase(value: ResultPhase): Self = StObject.set(x, "resultPhase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RepositoryActivityMetrics extends StObject {
    
    var codeChangesCount: Double = js.native
    
    var codeChangesTrend: js.Array[CodeChangeTrendItem] = js.native
    
    var repositoryId: String = js.native
  }
  object RepositoryActivityMetrics {
    
    @scala.inline
    def apply(codeChangesCount: Double, codeChangesTrend: js.Array[CodeChangeTrendItem], repositoryId: String): RepositoryActivityMetrics = {
      val __obj = js.Dynamic.literal(codeChangesCount = codeChangesCount.asInstanceOf[js.Any], codeChangesTrend = codeChangesTrend.asInstanceOf[js.Any], repositoryId = repositoryId.asInstanceOf[js.Any])
      __obj.asInstanceOf[RepositoryActivityMetrics]
    }
    
    @scala.inline
    implicit class RepositoryActivityMetricsMutableBuilder[Self <: RepositoryActivityMetrics] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCodeChangesCount(value: Double): Self = StObject.set(x, "codeChangesCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodeChangesTrend(value: js.Array[CodeChangeTrendItem]): Self = StObject.set(x, "codeChangesTrend", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodeChangesTrendVarargs(value: CodeChangeTrendItem*): Self = StObject.set(x, "codeChangesTrend", js.Array(value :_*))
      
      @scala.inline
      def setRepositoryId(value: String): Self = StObject.set(x, "repositoryId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RepositoryLanguageAnalytics extends StObject {
    
    var id: String = js.native
    
    var languageBreakdown: js.Array[LanguageStatistics] = js.native
    
    var name: String = js.native
    
    var resultPhase: ResultPhase = js.native
    
    var updatedTime: Date = js.native
  }
  object RepositoryLanguageAnalytics {
    
    @scala.inline
    def apply(
      id: String,
      languageBreakdown: js.Array[LanguageStatistics],
      name: String,
      resultPhase: ResultPhase,
      updatedTime: Date
    ): RepositoryLanguageAnalytics = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], languageBreakdown = languageBreakdown.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], resultPhase = resultPhase.asInstanceOf[js.Any], updatedTime = updatedTime.asInstanceOf[js.Any])
      __obj.asInstanceOf[RepositoryLanguageAnalytics]
    }
    
    @scala.inline
    implicit class RepositoryLanguageAnalyticsMutableBuilder[Self <: RepositoryLanguageAnalytics] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLanguageBreakdown(value: js.Array[LanguageStatistics]): Self = StObject.set(x, "languageBreakdown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLanguageBreakdownVarargs(value: LanguageStatistics*): Self = StObject.set(x, "languageBreakdown", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultPhase(value: ResultPhase): Self = StObject.set(x, "resultPhase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdatedTime(value: Date): Self = StObject.set(x, "updatedTime", value.asInstanceOf[js.Any])
    }
  }
}
