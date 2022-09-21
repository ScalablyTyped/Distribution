package typings.vsoNodeApi

import typings.vsoNodeApi.anon.EnumValuesHourly
import typings.vsoNodeApi.anon.EnumValuesPreliminary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object projectAnalysisInterfacesMod {
  
  @js.native
  sealed trait AggregationType extends StObject
  @JSImport("vso-node-api/interfaces/ProjectAnalysisInterfaces", "AggregationType")
  @js.native
  object AggregationType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[AggregationType & Double] = js.native
    
    @js.native
    sealed trait Daily
      extends StObject
         with AggregationType
    /* 1 */ val Daily: typings.vsoNodeApi.projectAnalysisInterfacesMod.AggregationType.Daily & Double = js.native
    
    @js.native
    sealed trait Hourly
      extends StObject
         with AggregationType
    /* 0 */ val Hourly: typings.vsoNodeApi.projectAnalysisInterfacesMod.AggregationType.Hourly & Double = js.native
  }
  
  @js.native
  sealed trait ResultPhase extends StObject
  @JSImport("vso-node-api/interfaces/ProjectAnalysisInterfaces", "ResultPhase")
  @js.native
  object ResultPhase extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ResultPhase & Double] = js.native
    
    @js.native
    sealed trait Full
      extends StObject
         with ResultPhase
    /* 1 */ val Full: typings.vsoNodeApi.projectAnalysisInterfacesMod.ResultPhase.Full & Double = js.native
    
    @js.native
    sealed trait Preliminary
      extends StObject
         with ResultPhase
    /* 0 */ val Preliminary: typings.vsoNodeApi.projectAnalysisInterfacesMod.ResultPhase.Preliminary & Double = js.native
  }
  
  object TypeInfo {
    
    @JSImport("vso-node-api/interfaces/ProjectAnalysisInterfaces", "TypeInfo")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("vso-node-api/interfaces/ProjectAnalysisInterfaces", "TypeInfo.AggregationType")
    @js.native
    def AggregationType: EnumValuesHourly = js.native
    inline def AggregationType_=(x: EnumValuesHourly): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AggregationType")(x.asInstanceOf[js.Any])
    
    @JSImport("vso-node-api/interfaces/ProjectAnalysisInterfaces", "TypeInfo.CodeChangeTrendItem")
    @js.native
    def CodeChangeTrendItem: Any = js.native
    inline def CodeChangeTrendItem_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CodeChangeTrendItem")(x.asInstanceOf[js.Any])
    
    @JSImport("vso-node-api/interfaces/ProjectAnalysisInterfaces", "TypeInfo.ProjectActivityMetrics")
    @js.native
    def ProjectActivityMetrics: Any = js.native
    inline def ProjectActivityMetrics_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ProjectActivityMetrics")(x.asInstanceOf[js.Any])
    
    @JSImport("vso-node-api/interfaces/ProjectAnalysisInterfaces", "TypeInfo.ProjectLanguageAnalytics")
    @js.native
    def ProjectLanguageAnalytics: Any = js.native
    inline def ProjectLanguageAnalytics_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ProjectLanguageAnalytics")(x.asInstanceOf[js.Any])
    
    @JSImport("vso-node-api/interfaces/ProjectAnalysisInterfaces", "TypeInfo.RepositoryActivityMetrics")
    @js.native
    def RepositoryActivityMetrics: Any = js.native
    inline def RepositoryActivityMetrics_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RepositoryActivityMetrics")(x.asInstanceOf[js.Any])
    
    @JSImport("vso-node-api/interfaces/ProjectAnalysisInterfaces", "TypeInfo.RepositoryLanguageAnalytics")
    @js.native
    def RepositoryLanguageAnalytics: Any = js.native
    inline def RepositoryLanguageAnalytics_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RepositoryLanguageAnalytics")(x.asInstanceOf[js.Any])
    
    @JSImport("vso-node-api/interfaces/ProjectAnalysisInterfaces", "TypeInfo.ResultPhase")
    @js.native
    def ResultPhase: EnumValuesPreliminary = js.native
    inline def ResultPhase_=(x: EnumValuesPreliminary): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ResultPhase")(x.asInstanceOf[js.Any])
  }
  
  trait AnalyzerDescriptor extends StObject {
    
    var description: String
    
    var id: String
    
    var majorVersion: Double
    
    var minorVersion: Double
    
    var name: String
    
    var patchVersion: Double
  }
  object AnalyzerDescriptor {
    
    inline def apply(
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
    
    extension [Self <: AnalyzerDescriptor](x: Self) {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setMajorVersion(value: Double): Self = StObject.set(x, "majorVersion", value.asInstanceOf[js.Any])
      
      inline def setMinorVersion(value: Double): Self = StObject.set(x, "minorVersion", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPatchVersion(value: Double): Self = StObject.set(x, "patchVersion", value.asInstanceOf[js.Any])
    }
  }
  
  trait CodeChangeTrendItem extends StObject {
    
    var time: js.Date
    
    var value: Double
  }
  object CodeChangeTrendItem {
    
    inline def apply(time: js.Date, value: Double): CodeChangeTrendItem = {
      val __obj = js.Dynamic.literal(time = time.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[CodeChangeTrendItem]
    }
    
    extension [Self <: CodeChangeTrendItem](x: Self) {
      
      inline def setTime(value: js.Date): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait LanguageStatistics extends StObject {
    
    var bytes: Double
    
    var files: Double
    
    var filesPercentage: Double
    
    var languagePercentage: Double
    
    var name: String
  }
  object LanguageStatistics {
    
    inline def apply(bytes: Double, files: Double, filesPercentage: Double, languagePercentage: Double, name: String): LanguageStatistics = {
      val __obj = js.Dynamic.literal(bytes = bytes.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any], filesPercentage = filesPercentage.asInstanceOf[js.Any], languagePercentage = languagePercentage.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[LanguageStatistics]
    }
    
    extension [Self <: LanguageStatistics](x: Self) {
      
      inline def setBytes(value: Double): Self = StObject.set(x, "bytes", value.asInstanceOf[js.Any])
      
      inline def setFiles(value: Double): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesPercentage(value: Double): Self = StObject.set(x, "filesPercentage", value.asInstanceOf[js.Any])
      
      inline def setLanguagePercentage(value: Double): Self = StObject.set(x, "languagePercentage", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait ProjectActivityMetrics extends StObject {
    
    var authorsCount: Double
    
    var codeChangesCount: Double
    
    var codeChangesTrend: js.Array[CodeChangeTrendItem]
    
    var projectId: String
    
    var pullRequestsCompletedCount: Double
    
    var pullRequestsCreatedCount: Double
  }
  object ProjectActivityMetrics {
    
    inline def apply(
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
    
    extension [Self <: ProjectActivityMetrics](x: Self) {
      
      inline def setAuthorsCount(value: Double): Self = StObject.set(x, "authorsCount", value.asInstanceOf[js.Any])
      
      inline def setCodeChangesCount(value: Double): Self = StObject.set(x, "codeChangesCount", value.asInstanceOf[js.Any])
      
      inline def setCodeChangesTrend(value: js.Array[CodeChangeTrendItem]): Self = StObject.set(x, "codeChangesTrend", value.asInstanceOf[js.Any])
      
      inline def setCodeChangesTrendVarargs(value: CodeChangeTrendItem*): Self = StObject.set(x, "codeChangesTrend", js.Array(value*))
      
      inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
      
      inline def setPullRequestsCompletedCount(value: Double): Self = StObject.set(x, "pullRequestsCompletedCount", value.asInstanceOf[js.Any])
      
      inline def setPullRequestsCreatedCount(value: Double): Self = StObject.set(x, "pullRequestsCreatedCount", value.asInstanceOf[js.Any])
    }
  }
  
  trait ProjectLanguageAnalytics extends StObject {
    
    var id: String
    
    var languageBreakdown: js.Array[LanguageStatistics]
    
    var repositoryLanguageAnalytics: js.Array[RepositoryLanguageAnalytics]
    
    var resultPhase: ResultPhase
    
    var url: String
  }
  object ProjectLanguageAnalytics {
    
    inline def apply(
      id: String,
      languageBreakdown: js.Array[LanguageStatistics],
      repositoryLanguageAnalytics: js.Array[RepositoryLanguageAnalytics],
      resultPhase: ResultPhase,
      url: String
    ): ProjectLanguageAnalytics = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], languageBreakdown = languageBreakdown.asInstanceOf[js.Any], repositoryLanguageAnalytics = repositoryLanguageAnalytics.asInstanceOf[js.Any], resultPhase = resultPhase.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProjectLanguageAnalytics]
    }
    
    extension [Self <: ProjectLanguageAnalytics](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLanguageBreakdown(value: js.Array[LanguageStatistics]): Self = StObject.set(x, "languageBreakdown", value.asInstanceOf[js.Any])
      
      inline def setLanguageBreakdownVarargs(value: LanguageStatistics*): Self = StObject.set(x, "languageBreakdown", js.Array(value*))
      
      inline def setRepositoryLanguageAnalytics(value: js.Array[RepositoryLanguageAnalytics]): Self = StObject.set(x, "repositoryLanguageAnalytics", value.asInstanceOf[js.Any])
      
      inline def setRepositoryLanguageAnalyticsVarargs(value: RepositoryLanguageAnalytics*): Self = StObject.set(x, "repositoryLanguageAnalytics", js.Array(value*))
      
      inline def setResultPhase(value: ResultPhase): Self = StObject.set(x, "resultPhase", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait RepositoryActivityMetrics extends StObject {
    
    var codeChangesCount: Double
    
    var codeChangesTrend: js.Array[CodeChangeTrendItem]
    
    var repositoryId: String
  }
  object RepositoryActivityMetrics {
    
    inline def apply(codeChangesCount: Double, codeChangesTrend: js.Array[CodeChangeTrendItem], repositoryId: String): RepositoryActivityMetrics = {
      val __obj = js.Dynamic.literal(codeChangesCount = codeChangesCount.asInstanceOf[js.Any], codeChangesTrend = codeChangesTrend.asInstanceOf[js.Any], repositoryId = repositoryId.asInstanceOf[js.Any])
      __obj.asInstanceOf[RepositoryActivityMetrics]
    }
    
    extension [Self <: RepositoryActivityMetrics](x: Self) {
      
      inline def setCodeChangesCount(value: Double): Self = StObject.set(x, "codeChangesCount", value.asInstanceOf[js.Any])
      
      inline def setCodeChangesTrend(value: js.Array[CodeChangeTrendItem]): Self = StObject.set(x, "codeChangesTrend", value.asInstanceOf[js.Any])
      
      inline def setCodeChangesTrendVarargs(value: CodeChangeTrendItem*): Self = StObject.set(x, "codeChangesTrend", js.Array(value*))
      
      inline def setRepositoryId(value: String): Self = StObject.set(x, "repositoryId", value.asInstanceOf[js.Any])
    }
  }
  
  trait RepositoryLanguageAnalytics extends StObject {
    
    var id: String
    
    var languageBreakdown: js.Array[LanguageStatistics]
    
    var name: String
    
    var resultPhase: ResultPhase
    
    var updatedTime: js.Date
  }
  object RepositoryLanguageAnalytics {
    
    inline def apply(
      id: String,
      languageBreakdown: js.Array[LanguageStatistics],
      name: String,
      resultPhase: ResultPhase,
      updatedTime: js.Date
    ): RepositoryLanguageAnalytics = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], languageBreakdown = languageBreakdown.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], resultPhase = resultPhase.asInstanceOf[js.Any], updatedTime = updatedTime.asInstanceOf[js.Any])
      __obj.asInstanceOf[RepositoryLanguageAnalytics]
    }
    
    extension [Self <: RepositoryLanguageAnalytics](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLanguageBreakdown(value: js.Array[LanguageStatistics]): Self = StObject.set(x, "languageBreakdown", value.asInstanceOf[js.Any])
      
      inline def setLanguageBreakdownVarargs(value: LanguageStatistics*): Self = StObject.set(x, "languageBreakdown", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setResultPhase(value: ResultPhase): Self = StObject.set(x, "resultPhase", value.asInstanceOf[js.Any])
      
      inline def setUpdatedTime(value: js.Date): Self = StObject.set(x, "updatedTime", value.asInstanceOf[js.Any])
    }
  }
}
